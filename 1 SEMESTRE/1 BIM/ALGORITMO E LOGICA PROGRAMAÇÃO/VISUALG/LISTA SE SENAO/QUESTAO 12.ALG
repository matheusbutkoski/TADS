Algoritmo "QUESTAO 12"

Var
hr : real
min : real
vel : real

Inicio
escreval ("Informe o tempo em que a dist�ncia foi percorrida em minutos")
 leia(min)
 
hr <- min/60
vel <- 50/hr

se (vel > 80) entao
 escreval ("Voc� ultrapassou o limite da via, com vel m�dia de:", vel:8:2, "km/h")
senao
 escreval ("Voc� n�o ultrapassou o limite da via, com vel m�dia de:", vel:8:2, "km/h")
fimse








Fimalgoritmo