Algoritmo "QUESTAO 18"
Var
h : real
sal : real

ex : real
Inicio
escreval ("Digite o número de horas trabalhadas no mes")
 leia(h)
escreval ("Digite seu salário por hora")
 leia (sal)
ex <- (h - 120)
se (h > 120) entao
 escreval ("Seu salário nesse mês foi de:", h * sal + (ex * sal * 0.50))
senao
 escreval ("Seu salário foi de:", h * sal)
fimse






Fimalgoritmo