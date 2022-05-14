Algoritmo "QUESTAO 9"

Var
nota1 : real
nota2 : real
media : real
Inicio
escreval("Digite o valor da primeira nota")
 leia(nota1)
escreval("Digite o valor da segunda nota")
 leia(nota2)
media <- (nota1 + nota2) / 2
se (media <= 5) entao
 escreval ("Reprovado!")
fimse
se (media >= 5.1) e (media <= 6.9) entao
 escreval ("Exame!")
fimse
se (media >= 7.0) entao
 escreval ("Aprovado!")
fimse







Fimalgoritmo