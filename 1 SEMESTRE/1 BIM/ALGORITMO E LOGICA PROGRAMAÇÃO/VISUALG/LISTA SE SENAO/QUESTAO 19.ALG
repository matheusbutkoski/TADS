Algoritmo "QUESTAO 19"

Var
peso : real
nome : caracter
altura : real
sexo : caracter
Inicio
escreval ("Informe seu nome")
 leia (nome)
escreval ("Informe sua altura")
 leia (altura)
escreval ("Informe seu sexo M ou F")
 leia (sexo)
se (sexo = "F") entao
 escreval (nome, ", seu peso ideal é", (62.1 * altura) - 44.7)
senao
 escreval (nome, ", seu peso ideal é", (72.7 * altura) - 58)
fimse




Fimalgoritmo