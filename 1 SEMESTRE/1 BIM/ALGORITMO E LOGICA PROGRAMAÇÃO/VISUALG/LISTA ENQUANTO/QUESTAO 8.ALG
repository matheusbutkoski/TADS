Algoritmo "QUESTAO 8"
Var
x : inteiro
soma : real
qtd : inteiro

Inicio
escreval("Digite vários números e quando quiser parar digite 0")
x <- 1
enquanto ( x <> 0) faca
escreval ("Informe um número")
  leia (x)
 se (x >= 0) entao
  soma <- soma + x
 senao
  qtd <- qtd + 1
  fimse
fimenquanto
escreval ("A soma dos positivos é: ", soma)
escreval ("A quantidade de negativos é: ", qtd)


Fimalgoritmo