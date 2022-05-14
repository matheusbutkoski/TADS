var nota = 0;
var gabarito = [
{ 
    questao: "questao1",
    resposta: "B",
    peso: 1

},
{ 
    questao: "questao2",
    resposta: "B",
    peso: 1

},

{ 
    questao: "questao3",
    resposta: "C",
    peso: 3

},

{ 
    questao: "questao4",
    resposta: "D",
    peso: 3

},

{ 
    questao: "questao5",
    resposta: "A",
    peso: 2

},
];
function pegarQuestoesMarcadas(){
    var questoesSelecionadas = [];
    for(var qtdQuestoes = 0; qtdQuestoes < 5; qtdQuestoes++){
       var nameQuestao = "questao" + (qtdQuestoes + 1);
    
        for(var i = 0; i < document.getElementsByName(nameQuestao).length; i++){
            var radioButton = document.getElementsByName(nameQuestao)[i];
            if (radioButton.checked)
                questoesSelecionadas.push({
                    questao: nameQuestao,
                    selecionada: radioButton.value
                });
        }
    }
    return questoesSelecionadas;
}
function efetuarCorrecao(){
    var questoes = pegarQuestoesMarcadas();
    
    for (var i = 0; i < questoes.length; i++){
        for(var g = 0; g < gabarito.length; g++){
            var questao = questoes[i];
            var questGab = gabarito[g];

            if(questao.questao == questGab.questao && questao.selecionada == questGab.resposta){
                nota = nota + questGab.peso;
                questao.resposta = 'certo'
                

            }
        }
    } 
    console.log(nota);

    var result = " Reprovado";
    var classe = 'reprovado'

    if (nota >= 7){
        result = " Aprovado";
        classe = 'aprovado'
    }
    
    var div = document.getElementById("div_resultado");
    div.innerHTML = "<p class='"+ classe +"'>" + result + "</p>"

        for(var i = 0; i < gabarito.length; i++){
            console.log(gabarito[i].questao);
            var alternativas = document.getElementsByName(gabarito[i].questao);
        
            for(var b=0; b < alternativas.length; b++){
                var respostaAlt = alternativas[b].value

        if (respostaAlt == gabarito[i].resposta){
            alternativas[b].className = "certo";
        }
    }
    }
    var altSelecionadas = pegarQuestoesMarcadas();
    for(var i = 0; i < altSelecionadas.length; i++){
        var altS = document.getElementsByName
            (altSelecionadas[i].questao);
    
            altS.forEach(function (a){
                var acertou = gabarito.filter(function (gab){
                    return gab.resposta == a.value && 
                           gab.selecionada == altSelecionadas[i].questao;
                })[0];
                
                if(a.checked && !acertou){
                    a.className = "errado";
                }
    
            });
    }
}

