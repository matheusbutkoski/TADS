Algoritmo "QUESTAO 1"

Var
op : caracter
num1 : inteiro
num2 : inteiro
res : inteiro
Inicio
escreval ("Informe 2 n�meros")
 leia (num1)
 leia (num2)
escreval ("Informe qual opera��o deseja fazer (+ - * /)")
 leia (op)
 escolha (op)
 
  caso "+"
 res := num1 + num2
  caso "-"
 res := num1 - num2
  caso "*"
 res := num1 * num2
  caso "/"
 res := num1 / num2
 fimescolha

escreval("Resultado: ", res)

Fimalgoritmo