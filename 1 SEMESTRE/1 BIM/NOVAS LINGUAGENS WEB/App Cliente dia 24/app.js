var Produtos = []; 
function adicionar () {
	$("#form-listagem").hide();
	$("#form-cadastro").show();

    $("#ovTXT_Codigo").val("");
	$("ovTXT_Descricao").val("");
}	

function cancelar () {
	$("#form-listagem").show();
    $("#form-cadastro").hide();
}

function salvar () {
    Produtos.push ({
    Codigo: $("#ovTXT_Codigo").val (), 
	Descrição: $("ovTXT_Descricao").val()
   });
    $("#form-listagem").show();
    $("#form-cadastro").hide();
}
   

(document).ready(function () {
	$("#form-cadastro").hide();
	
	$(document).on("click", "#ovBTN_Adicionar", adicionar);
	$(document).on("click", "#ovBTN_Cancelar", cancelar);
	$(document).on("click", "#ovBTN_Salvar", salvar);
		
	});
