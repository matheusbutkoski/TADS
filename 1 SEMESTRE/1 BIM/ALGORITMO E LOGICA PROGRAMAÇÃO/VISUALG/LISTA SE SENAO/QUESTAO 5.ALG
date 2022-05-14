Algoritmo "QUESTAO 5"

Var
raiz : real
num : real
met : real
Inicio
escreval("Digite um número")
 leia(num)
raiz <- raizq(num)
met <- (num/2)
 se (num mod 2 = 0)entao
  escreval ("A raiz quadrada desse número é:", raiz)
 senao
  escreval ("A metade desse número é:", met)
 fimse
Fimalgoritmo