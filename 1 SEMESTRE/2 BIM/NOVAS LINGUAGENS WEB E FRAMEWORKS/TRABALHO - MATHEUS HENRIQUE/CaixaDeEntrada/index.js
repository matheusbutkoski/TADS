$(document).ready(function  (){

$(document).on ("click", "#logo", voltar_login);

$(document).on ("click", "#link-entrada", ac_entrada);

$(document).on ("click", "#link-enviados", ac_enviados);

$(document).on ("click", "#link-rascunhos", ac_rascunhos);

$(document).on ("click", "#link-spam", ac_spam);

$(document).on ("click", "#link-lixeira", ac_lixeira);



});

function voltar_login(){
window.location.href= "../login.html";

};

function ac_entrada (){

$("#frameEmails").attr("src", "Enviados.html");
}
function ac_enviados (){

$("#frameEmails").attr("src", "CaixaEntrada.html");
}

function ac_rascunhos (){

$("#frameEmails").attr("src", "Rascunhos.html");
}

function ac_spam (){

$("#frameEmails").attr("src", "Spam.html");
}

function ac_lixeira (){

$("#frameEmails").attr("src", "Lixeira.html");
}