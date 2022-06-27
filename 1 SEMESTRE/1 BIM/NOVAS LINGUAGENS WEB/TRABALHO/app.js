var Produtos = []
var Produto = null

function NovoProduto () {

    return {
        Código: "",
        Descrição: "",
        Marca: "",
        Unidade_de_Medida: "",
        Preço_de_Custo: "",
        Preço_de_Venda: "",
        Percentual_de_Lucro: "",
        Controle_de_Estoque: "",
        Estoque_Minimo: "",
        Estoque_Atual: "",
        Estoque_Máximo: "",
     };
}

function adicionar () {
 Produto = NovoProduto ();
  $("form-listagem").hide();
  $("form-cadastro").show();

  $("#ovTXT_Codigo").val(Produto.Código);
  $("#ovTXT_Descricao").val(Produto.Descrição);
  $("#ovTXT_Marca").val(Produto.Marca);
  $("#ovTXT_UniDMed").val(Produto.Unidade_de_Medida);
  $("#ovNUM_Custo").val(Produto.Preço_de_Custo);
  $("#ovNUM_PreVen").val(Produto.Preço_de_Venda);
  $("#ovNUM_PerLuc").val(Produto.Percentual_de_Lucro);
  $("#ovFlag_CDE").val(Produto.Controle_de_Estoque);
  $("#ovNUM_EstMin").val(Produto.Estoque_Minimo);
  $("#ovNUM_EstAtu").val(Produto.Estoque_Atual);
  $("ovNUM_EstAtu").val(Produto.Estoque_Máximo);



$(document).ready(function(){
$("#form-cadastro").hide();
$(document).on("click", "ovBTN_Adicionar",)

     
})  



}