Algoritmo "QUESTAO 8"
Var
x : inteiro
soma : real
qtd : inteiro

Inicio
escreval("Digite v�rios n�meros e quando quiser parar digite 0")
x <- 1
enquanto ( x <> 0) faca
escreval ("Informe um n�mero")
  leia (x)
 se (x >= 0) entao
  soma <- soma + x
 senao
  qtd <- qtd + 1
  fimse
fimenquanto
escreval ("A soma dos positivos �: ", soma)
escreval ("A quantidade de negativos �: ", qtd)


Fimalgoritmo