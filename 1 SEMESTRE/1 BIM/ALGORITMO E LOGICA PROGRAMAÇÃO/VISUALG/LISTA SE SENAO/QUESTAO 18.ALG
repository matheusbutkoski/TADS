Algoritmo "QUESTAO 18"
Var
h : real
sal : real

ex : real
Inicio
escreval ("Digite o n�mero de horas trabalhadas no mes")
 leia(h)
escreval ("Digite seu sal�rio por hora")
 leia (sal)
ex <- (h - 120)
se (h > 120) entao
 escreval ("Seu sal�rio nesse m�s foi de:", h * sal + (ex * sal * 0.50))
senao
 escreval ("Seu sal�rio foi de:", h * sal)
fimse






Fimalgoritmo