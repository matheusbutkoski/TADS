Algoritmo "FORMAS PAGAMENTO"

Var
valor : real
fPag : caracter


Inicio
 escreval ("Qual o valor total da compra")
leia(valor)
 escreval ("Qual a forma de pagamento a ser utilizada")
leia(fPag)
se (fPag = "v") entao
valor <- valor * 0.9
fimse
se (fPag = "pix") entao
valor <- valor * 0.8
fimse
se (fPag = "btc") entao
valor <- valor * 0.5
fimse

escreval ("O valor total da compra é:", valor)



Fimalgoritmo