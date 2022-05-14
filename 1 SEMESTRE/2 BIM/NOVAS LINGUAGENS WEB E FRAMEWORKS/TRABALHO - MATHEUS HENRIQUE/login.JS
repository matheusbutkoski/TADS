$(document).ready(function () {
    $(document).on("click", "#ovBTN_Prox", fnProximo);
});






function fnProximo() {

    if ($("#txtEmail").is(":visible")) { // Se está visivel...
        $(".row-email").hide();
        $(".row-senha").show();
        $(".row-criar label").html("Esqueceu a Senha?");

    } else {
        window.location.href = "./CaixaDeEntrada/index.html"; // Redireciona para Caixa de Entrada.
    }
}



