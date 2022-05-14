Algoritmo "QUESTAO 3"

Var
x : real
y : real
z : real

Inicio
escreval ("Digite o primeiro número")
leia(x)
escreval ("Digite o segundo número")
leia(y)
escreval ("Digite o terceiro número")
leia(z)

se (x > y)entao
 se (x > z)entao
  se (y > z)entao
    escreval ("A ordem crescente é:", z,",", y,",", x)
 senao
    escreval ("A ordem crescente é:", y,",", z,",", x)
  fimse
 fimse
fimse

se (y > x)entao
 se (y > z)entao
  se (z > x)entao
    escreval ("A ordem crescente é:", x,",", z,",", y)
 senao
    escreval ("A ordem crescente é:", z,",", x,",", y)
  fimse
 fimse
fimse

se (z > x)entao
 se (z > y)entao
  se (y > x)entao
    escreval ("A ordem crescente é:", x,",", y,",", z)
 senao
    escreval ("A ordem crescente é:", y,",", x,",", z)
  fimse
 fimse
fimse
Fimalgoritmo
