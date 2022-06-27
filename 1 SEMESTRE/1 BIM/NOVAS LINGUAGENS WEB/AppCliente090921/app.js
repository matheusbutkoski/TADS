var Produtos = []; // Array
var Produto = null;

function NewProduto(){
	return {
		Codigo: "",
		Descricao: ""
	};
}

function adicionar(){
	Produto = NewProduto();
	
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
	Produto.Descricao = $("#ovTXT_Descricao").val();
	Produtos.push(Produto);	
	carregarProdutos();
	
	$("#form-listagem").show();
	$("#form-cadastro").hide();
	
} 


function carregarProdutos(){
	Produtos.map(function (prod){
		// Iteração entre os itens da lista...
		$("#ovTR_Produtos tbody").append(
			"<tr>" + 
			"   <td>" + prod.Codigo + "</td>" +
			"   <td>" + prod.Descricao + "</td>" +
			"   <td><button type='button' " + 
			"               class='btn btn-editar btn-secondary' " +
            "               data-codigo='"+ prod.Codigo + "'>" +
			"       <i class='fa fa-edit'></i> Editar</button>" +
			"       <button type='button' " + 
			"               class='btn btn-remover btn-danger' " +
            "               data-codigo='"+ prod.Codigo + "'>" +
			"       <i class='fa fa-trash'></i> Remover</button>" + 					
			"   </td>" +
			"</tr>"
		);
	});
	addEventEditar();
}
function addEventEditar() {
	$("btn-editar").each(function () {
		$(this).on("click", function () {
		var codigoProduto = $(this).attr("data-codigo");
		Produto = Produtos.filter(function (prod) {
		 return prod.Codigo == codigoProduto;
		
		})[0];
		$("#ovTXT_Codigo").val(Produto.Codigo);
	    $("#ovTXT_Descricao").val(Produto.Descricao);

		$("#form-listagem").hide();
	    $("#form-cadastro").show(); 


	 });
 });

}

$(document).ready(function (){
	$("#form-cadastro").hide();
	
	$(document).on("click", "#ovBTN_Adicionar", adicionar);
	$(document).on("click", "#ovBTN_Cancelar", cancelar);
	$(document).on("click", "#ovBTN_Salvar", salvar);
});