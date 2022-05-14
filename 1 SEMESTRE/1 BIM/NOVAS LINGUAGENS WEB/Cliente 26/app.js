var Produtos = []; // Array
var Produto = null;

function NewProduto() {
	return {
		Codigo: "",
		Descricao:""
	};
}

function adicionar(){
	Produto = NewProduto ();

	$("#form-listagem").hide();
	$("#form-cadastro").show();
	
	$("#ovTXT_Codigo").val(Produto.Codigo);
	$("#ovTXT_Descricao").val(Produto.Descricao);
}

function cancelar(){
	$("#form-listagem").show();
	$("#form-cadastro").hide();
}

function salvar(){
    Produto.Codigo = $("#ovTXT_Codigo").val();
	Produto.Descricao = $("ovTXT_Descricao").val();
	Produtos.push(Produto);
	carregarProdutos();
	
	$("#form-listagem").show();
	$("#form-cadastro").hide();
}

function carregarProdutos(){
	Produtos.map(function (prod){
	$ ("#ovTR_Produtos tbody").append(
		"<tr>" +
		"  <td>" + prod.Codigo + "</td>" +
		"  <td>" + prod.Descricao + "/td" +
		"  <td>...</td>" +
		"</td>"
	   );
	});
};
	

	


$(document).ready(function (){
	$("#form-cadastro").hide();
	
	$(document).on("click", "#ovBTN_Adicionar", adicionar);
	$(document).on("click", "#ovBTN_Cancelar", cancelar);
	$(document).on("click", "#ovBTN_Salvar", salvar);
});