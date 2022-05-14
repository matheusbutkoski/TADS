Algoritmo "semnome"

Var
renda : real
res : caracter
x : inteiro
Inicio

enquanto (x <> 1) faca
escreval ("Informe sua renda mensal")
leia (renda)
 se (renda < 1637.11) entao
  escreval ("Seu imposto é isento")
 fimse
  
 se (renda > 1637.12) e (renda < 2453.50) entao
  escreval ("Voce deve pagar", renda * 0.075)
 fimse
  
 se (renda > 2453.51) e (renda < 3271.80) entao
  escreval ("Voce deve pagar", renda * 0.15)
  fimse
  
 se (renda > 3271.39) e (renda < 4087.65) entao
   escreval ("Voce deve pagar", renda * 0.225)
   fimse
   
 se (renda > 4087.66) entao
   escreval ("Voce deve pagar R$", renda * 0.275)
   fimse
   
 escreval ("Deseja consultar novamente?")
  leia (res)
   se (res = "N") entao
    x <- 1
   fimse
fimenquanto

Fimalgoritmo