Algoritmo "QUESTAO 2"

Var
idade : inteiro


Inicio
escreval ("Digite sua idade")
   leia(idade)
se (idade = 16) ou (idade = 17) entao
   escreval ("Você pode retirar seu título eleitor e se quiser também pode votar")
fimse

se (idade >= 18) e (idade < 71) entao
   escreval ("Você deve retirar seu título de eleitor e votar")
fimse

se (idade >= 71) entao
  escreval ("Você deve reitrar seu título de eleitor, porém pode optar em não votar")
fimse

se (idade < 16) entao
   escreval ("Voce ainda não pode retirar seu título e também não pode votar")
fimse




Fimalgoritmo
