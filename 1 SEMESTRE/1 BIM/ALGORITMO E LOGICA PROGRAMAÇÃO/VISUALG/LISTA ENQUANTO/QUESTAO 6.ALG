Algoritmo "semnome"

Var
x : inteiro
gen : caracter
alt : real
somaH : real
somaF : real
contF : inteiro
contH : inteiro
Inicio
x <- 1
enquanto (x <= 10) faca
 escreval ("Digite os dados da", x," pessoa")
 leia(gen)
 leia(alt)
  se (gen = "H") ou (gen = "h") entao
 somaH <- somaH + alt
 contH <- contH + 1
  senao
 contF <- contF + 1
 somaF <- somaF + alt
  fimse
x <- x + 1
fimenquanto
escreval ("A média de altura dos homens é de:", somaH / contH)
escreval ("A média de altura das mulheres é de:", somaF / contF)
Fimalgoritmo