Algoritmo "QUESTAO 13"

Var
cat1 : real
cat2 : real
hip : real


Inicio
escreval ("Digite o valor do primeiro cateto")
 leia(cat1)
escreval ("Digite o valor do segundo cateto")
 leia(cat2)
hip <- raizq((cat1^2) + (cat2^2))
se (hip > 100) entao
 escreval ("Hipotenusa de ", hip," excede o tamanho permitido para área")
senao
 escreval ("Hipotenusa de ", hip," aceita")
fimse




Fimalgoritmo