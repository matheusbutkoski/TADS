Algoritmo "QUESTAO 3"

Var
x : real
y : real
z : real

Inicio
escreval ("Digite o primeiro n�mero")
leia(x)
escreval ("Digite o segundo n�mero")
leia(y)
escreval ("Digite o terceiro n�mero")
leia(z)

se (x > y)entao
 se (x > z)entao
  se (y > z)entao
    escreval ("A ordem crescente �:", z,",", y,",", x)
 senao
    escreval ("A ordem crescente �:", y,",", z,",", x)
  fimse
 fimse
fimse

se (y > x)entao
 se (y > z)entao
  se (z > x)entao
    escreval ("A ordem crescente �:", x,",", z,",", y)
 senao
    escreval ("A ordem crescente �:", z,",", x,",", y)
  fimse
 fimse
fimse

se (z > x)entao
 se (z > y)entao
  se (y > x)entao
    escreval ("A ordem crescente �:", x,",", y,",", z)
 senao
    escreval ("A ordem crescente �:", y,",", x,",", z)
  fimse
 fimse
fimse
Fimalgoritmo
