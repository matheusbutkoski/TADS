Algoritmo "QUESTAO 22"

Var
a, b, c : real
del : real

Inicio
escreval ("Digite o valor de a")
 leia (a)
escreval ("Digite o valor de b")
 leia (b)
escreval ("Digite o valor de c")
 leia (c)
del <- b^2 - 4 * a * c

se (del >= 0) entao
 escreval ("O valor de delta �:", del)
fimse

se (del < 0) entao
 escreval ("N�o h� raizes reais")
fimse

se (a = 0) entao
 escreval ("N�o � equa��o de segundo grau")
fimse



Fimalgoritmo