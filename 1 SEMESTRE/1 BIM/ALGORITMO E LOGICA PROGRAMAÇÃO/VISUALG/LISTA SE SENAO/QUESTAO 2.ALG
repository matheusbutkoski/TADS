Algoritmo "QUESTAO 2"

Var
idade : inteiro


Inicio
escreval ("Digite sua idade")
   leia(idade)
se (idade = 16) ou (idade = 17) entao
   escreval ("Voc� pode retirar seu t�tulo eleitor e se quiser tamb�m pode votar")
fimse

se (idade >= 18) e (idade < 71) entao
   escreval ("Voc� deve retirar seu t�tulo de eleitor e votar")
fimse

se (idade >= 71) entao
  escreval ("Voc� deve reitrar seu t�tulo de eleitor, por�m pode optar em n�o votar")
fimse

se (idade < 16) entao
   escreval ("Voce ainda n�o pode retirar seu t�tulo e tamb�m n�o pode votar")
fimse




Fimalgoritmo
