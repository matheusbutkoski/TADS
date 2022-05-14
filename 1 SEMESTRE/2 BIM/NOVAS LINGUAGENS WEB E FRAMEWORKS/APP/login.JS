$(document).ready(function(){
    $(document).on("click","#ovBTN_Prox",fnProximo);
});

function fnProximo(){
        $(".row-email").hide();
        $(".row-senha").show();
        $(".row-criar label").html("Esqueceu a Senha?"); 
        
}