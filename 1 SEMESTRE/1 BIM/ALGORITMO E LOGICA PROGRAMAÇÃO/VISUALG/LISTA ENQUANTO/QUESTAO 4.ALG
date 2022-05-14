Algoritmo "semnome"

Var
x : inteiro
maior : real
num : real
Inicio
x <- 1
maior <- 1
enquanto (x <= 10) faca
 escreval ("Digite um número")
  leia (num)
  se (x = 1) entao
   maior = num
  fimse
  se (num > maior) entao
   maior <- num
  fimse
   x <- x + 1
fimenquanto
 escreval ("O maior número é", maior)
  


Fimalgoritmo