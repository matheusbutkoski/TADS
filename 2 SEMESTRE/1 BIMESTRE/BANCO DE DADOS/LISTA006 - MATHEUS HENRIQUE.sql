/*1*/
create view cliente_cidade_vw as
	select c.primeiro_nome, ci.cidade from cliente c
    inner join endereco e on e.endereco_id = c.endereco_id
    inner join cidade ci on ci.cidade_id = e.cidade_id;

/*2*/
create view filme_categoria_vw as
	select f.titulo, fc.categoria_id from filme f
    join filme_categoria fc on fc.filme_id = f.filme_id;
    
/*3*/
create view cliente_media_vw as
select c.primeiro_nome,  count(i.filme_id)/12 from inventario i
inner join aluguel a on a.inventario_id = i.inventario_id
inner join cliente c on c.cliente_id = a.cliente_id
where a.data_de_aluguel between '2005-01-01' and '2005-12-31'
group by c.cliente_id;

/*4*/
create view cliente_info_vw as
select c.primeiro_nome, c.cliente_id, e.endereco, e.endereco_id, ci.cidade, ci.cidade_id from cliente c
join endereco e on e.endereco_id = c.endereco_id
join cidade ci on ci.cidade_id = e.cidade_id;

select primeiro_nome from cliente_info_vw
where cidade_id = 
	(select ci.cidade_id from cliente c
	join endereco e on e.endereco_id = c.endereco_id
	join cidade ci on ci.cidade_id = e.cidade_id
	where c.cliente_id = 400);
    
/*5*/
create view filme_ator_vw as
select f.titulo, fa.filme_id, a.primeiro_nome, fa.ator_id from filme_ator fa
join filme f on f.filme_id = fa.filme_id
join ator a on a.ator_id = fa.ator_id;

select titulo from filme_ator_vw
where ator_id in
	(select fa.ator_id from filme_ator fa
	join filme f on f.filme_id = fa.filme_id
	join ator a on a.ator_id = fa.ator_id
    where f.titulo = "WYOMING STORM");

/*6*/
create view media_aluguel_vw as
			(select count(a.aluguel_id) as alu from aluguel a
				group by a.cliente_id);

select c.primeiro_nome, count(a.aluguel_id) from cliente c
	inner join aluguel a on a.cliente_id = c.cliente_id
		group by c.primeiro_nome
		having count(a.aluguel_id) >= (select avg(alu) from media_aluguel_vw);



