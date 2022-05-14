var Produtos = [];
var Produto = null;

function NewProduto(){
	return {
		Codigo: "",
		Descricao: "",
		Marca: "",
		Estoque: "",
		Preço: "",
		Ativo: "",
		UDM: "",
		PDC: "",
		PL: "",
		CDE: "",
		EMin: "",
		EMax: "",

	};
}

function adicionar(){
	Produto = NewProduto();
	
	$("#TelaListProd").hide();
	$("#TelaCadProd").show();
	
	$("#ovTXT_Codigo").val(Produto.Codigo);
	$("#ovTXT_Descricao").val(Produto.Descricao);
	$("#ovTXT_Marca").val(Produto.Marca);
	$("#ovNUM_EstAtu").val(Produto.Estoque);
	$("#ovNUM_PreVen").val(Produto.Preço);
	$("#ovSEL_AtIn").val(Produto.Ativo);
	$("#ovTXT_UniDMed").val(Produto.UDM);
	$("#ovNUM_Custo").val(Produto.PDC);
	$("#ovNUM_PerLuc").val(Produto.PL);
	$("#ovFlag_CDE").val(Produto.CDE);
	$("#ovNUM_EstMin").val(Produto.EMin);
	$("#ovNUM_EstMax").val(Produto.EMax);

}

function cancelar(){
	$("#TelaListProd").show();
	$("#TelaCadProd").hide();
}

function salvar(){
	if (Produto.Codigo == "") {
		Produto.Codigo = $("#ovTXT_Codigo").val();
		Produto.Descricao = $("#ovTXT_Descricao").val();
		Produto.Marca = $("#ovTXT_Marca").val();
		Produto.Estoque = $("#ovNUM_EstAtu").val();
		Produto.Preço = $("#ovNUM_PreVen").val();
		Produto.Ativo = $("#ovSEL_AtIn")
		Produtos.push(Produto);
	} else {
		for(var i=0; i < Produtos.length; i++){
			if (Produtos[i].Codigo == Produto.Codigo){
				Produtos[i].Descricao = $("#ovTXT_Descricao").val();
				Produtos[i].Marca = $("#ovTXT_Marca").val();
				Produtos[i].Estoque = $("#ovNUM_EstAtu").val();
				Produtos[i].Preço = $("#ovNUM_PreVen").val();
				Produtos[i].Ativo = $("#ovSEL_AtIn").val();

			}
		}
	}
	carregarProdutos();
	
	$("#TelaListProd").show();
	$("#TelaCadProd").hide();
}

function carregarProdutos(){
	$("#ovTR_Produtos tbody").html("");
	Produtos.map(function (prod){
		$("#ovTR_Produtos tbody").append(
			"<tr>" + 
			"   <td>" + prod.Codigo + "</td>" +
			"   <td>" + prod.Descricao + "</td>" +
			"   <td>" + prod.Marca + "</td>" +
			"   <td>" + prod.Estoque + "</td>" +
			"   <td>" + prod.Preço + "</td>" +
		    "   <td>" + prod.Ativo + "</td>" +
			"   <td><button type='button' " + 
			"           class='btn btn-editar btn-primary' " +
            "           data-codigo='"+ prod.Codigo + "'>" +
			"       <i class='fa fa-edit'></i> Editar</button>" +
			"       <button type='button' " + 
			"           class='btn btn-remover btn-danger' " +
            "           data-codigo='"+ prod.Codigo + "'>" +
			"       <i class='fa fa-trash'></i> Remover</button>" + 					
			"   </td>" +
			"</tr>"
		);
	});
	EventoEditar();
	EventoRemover();
}

function EventoRemover(){
	
	$(".btn-remover").each(function (){
		$(this).on("click", function (){
			var codigoProduto = $(this).attr("data-codigo");
			
			var ProdutosAux = [];
			for(var i = 0; i < Produtos.length; i++)
			if (Produtos[i].Codigo != codigoProduto)
			ProdutosAux.push(Produtos[i]);
			Produtos = ProdutosAux;
			carregarProdutos();
			
			
		});
	});
}

function EventoEditar(){
	$(".btn-editar").each(function (){
		$(this).on("click", function (){
			var codigoProduto = $(this).attr("data-codigo");
			
			for(var i = 0; i < Produtos.length; i++){
				if (Produtos[i].Codigo == codigoProduto){
					Produto = Produtos[i];
					$("#ovTXT_Codigo").val(Produto.Codigo);
					$("#ovTXT_Descricao").val(Produto.Descricao);
				}
			}
			
			$("#TelaListProd").hide();
			$("#TelaCadProd").show();						
		});
	});
	
}

$(document).ready(function (){
	$("#TelaCadProd").hide();
	
	$(document).on("click", "#ovBTN_Adicionar", adicionar);
	$(document).on("click", "#ovBTN_Cancelar", cancelar);
	$(document).on("click", "#ovBTN_Salvar", salvar);
});

