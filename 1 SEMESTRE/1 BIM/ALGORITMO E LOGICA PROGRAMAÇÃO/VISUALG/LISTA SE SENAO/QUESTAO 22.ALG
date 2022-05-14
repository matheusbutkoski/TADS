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
 escreval ("O valor de delta é:", del)
fimse

se (del < 0) entao
 escreval ("Não há raizes reais")
fimse

se (a = 0) entao
 escreval ("Não é equação de segundo grau")
fimse



Fimalgoritmo