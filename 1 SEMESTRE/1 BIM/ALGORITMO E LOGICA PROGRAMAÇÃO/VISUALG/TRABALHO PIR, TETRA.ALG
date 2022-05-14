Algoritmo "NUMERO DE BOLAS PIRAMIDE"

Var
bol : inteiro
x : inteiro
somaPir : inteiro
pir : inteiro
somatet : real
baseT : inteiro
somabt: inteiro
tet : inteiro
Inicio
x <- 0
escreval ("Informe o número de bolas da lateral da base")
 leia (bol)
  enquanto (x <= bol) faca
  pir <- (bol - x) * (bol - x)
   somaPir <- somaPir + pir

   
   enquanto (bol > x) faca
  baseT <- (bol - x)
   somabt <- somabt + baseT



x <- x + 1
fimenquanto
escreval ("O valor total de bolas na piramide é de:", somaPir)
escreval ("O valor total de bolas no tetraedro é de:", somabt)
Fimalgoritmo