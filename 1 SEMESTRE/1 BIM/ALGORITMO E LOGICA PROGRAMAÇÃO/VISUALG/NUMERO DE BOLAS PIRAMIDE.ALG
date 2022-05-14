Algoritmo "NUMERO DE BOLAS PIRAMIDE"

Var
bol : inteiro
x : inteiro
somadec : inteiro
dec : inteiro
Inicio
x <- 0
escreval ("Informe o número de bolas da lateral da base da piramide")
 leia (bol)
  enquanto (x <= bol) faca
  dec <- (bol - x) * (bol - x)
  somadec <- somadec + dec
 x <- x + 1
fimenquanto
escreval ("O valor total de bolas na piramide é de:", somadec)





 

 






Fimalgoritmo