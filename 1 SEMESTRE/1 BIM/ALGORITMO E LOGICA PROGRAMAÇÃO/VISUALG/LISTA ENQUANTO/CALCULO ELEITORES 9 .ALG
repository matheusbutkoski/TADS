Algoritmo "QUESTAO 14"

Var
x : inteiro
num : inteiro
soma: inteiro



Inicio
x <- 1
escreval ("Informe um número inteiro")
 leia (num)
 enquanto (x < num) faca
  se (num mod x = 0) entao
  soma <- soma + x
  fimse
  x <- x + 1
  fimenquanto
  escreval ("A soma dos divisores é:", soma)



Fimalgoritmo