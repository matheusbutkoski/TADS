1 - create database lista002;


2 - create table alunos (
codigo int, nome text, telefone text, cidade text);

3 - desc alunos;

4 - create table alunos2 (codigo int, nome varchar(200), telefone varchar(50), cidade
varchar(100));

5 - create table funcionarios (nome text, endereço, text, telefone text, cidade text, estado text,
 cep text, rg text, cpf text, salário real);

6 - create table fornecedores (nome text, endereço text, telefone text, cidade text, estado text,
 cep text, cnpj text, email text);

7 - create table livros (codigo int, nome text, categoria text, resumo text, precocusto real, precovenda real);

8 - desc alunos2;
    desc funcionarios;
    desc fornecedores;
    desc livros;
 
9 - create table estoque (codigo int, nomedoproduto text, categoria text, quantidade int, fornecedor text);

10 - create table notas (codigo int, nomedoaluno text, 1bim real, 2bim real, 3bim real, 4bim real);

11 - create table caixa (codigo int, data date, descricao varchar(200), debito text, credito text);

     create table contasAPagar (codigo int, data_conta date, descricao varchar (200), valor real, data_pagamento date);

12 - create table contasAReceber (codigo int, data_conta date, descricao varchar (200), valor real, data_recebimento date);

13 - create table filmes (codigo int, nome varchar (100), sinopse varchar (500), categoria varchar (50), diretor varchar (50));

14 - create table CDs (codigo int, nome varchar (50), cantor varchar (50), ano int, quantidademusicas int);

15 - drop table alunos;

16 - desc alunos;

17 - drop table livros;

18 - drop table contasAPagar;

19 - drop table contasAReceber;

20 - drop table filmes;

21 - desc funcionarios;
     desc estoque;
	 desc cds;
	 desc caixa;
	 
22 - create table alunos (codigo int, nome text, telefone text, cidade text);

alter table alunos rename to super_alunos;

23 - desc super_alunos;

24 - alter table estoque rename to produtos;

25 -  alter table notas rename to aprovados;

26 - alter table aprovados rename to notas;

27 - create table dinheiro (valor int);

drop table dinheiro;

28 - drop table notas;

29 - alter table super_alunos rename to alunos;

30 - alter table alunos rename to estudantes;

31 - alter table estudantes rename to super_estudantes;

32 - desc super_estudantes;

33 - drop table super_estudantes;

34 - create table alunos (codigo int, nome text, telefone text, cidade text);

35 - alter table alunos add estado text;

36 - drop table caixa;

 create table caixa (codigo int, data date, descricao varchar(200), debito text, credito text);
 
37 - alter table caixa add observacao text;

38 - alter table alunos add cpf int;

39 - desc caixa;

40 - alter table caixa add saldo real;
