Algoritmo "QUESTAO 6"

Var
totalM : real
precoUM : real
precoDOIS : real
Inicio
escreval ("Digite o total de ma��s compradas")
 leia(totalM)
precoUM <- 1.30
precoDOIS <- 1
 se (totalM >= 12) entao
  escreval ("O valor a ser pago ser� de:", totalM * precoDOIS)
 senao
  escreval ("O valor a ser pago ser� de:", totalM * precoUM)
 fimse


Fimalgoritmo