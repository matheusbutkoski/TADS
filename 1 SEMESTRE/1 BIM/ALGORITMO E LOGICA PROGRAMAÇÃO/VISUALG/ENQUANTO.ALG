Algoritmo "semnome"

Var
id : inteiro
x : inteiro
soma : inteiro
media : real
qtd : inteiro
Inicio
escreval ("Informe o n�mero de idades")
leia (qtd)
x <- 1
enquanto ( x <= qtd) faca
 escreval ("Informe a idade")
  leia (id)
  soma <- soma + id
x <- x + 1
fimenquanto
media <- soma/qtd
 escreval ("A m�dia das idades �:", media)

Fimalgoritmo