Algoritmo "Base do Tetraedro"

Var
bol, baseT, somabt, tet, somatet, x, y, total : inteiro

Inicio

escreval ("Informe o n�mero de bolas da lateral da base")
leia (bol)
y <- 0
x <- 0
  enquanto (bol > y) faca
   tet <- (bol - 1)
     somatet <- somatet + tet

  enquanto (bol > x) faca
    baset <- (bol - x)
     somabt <- somabt + baset

x <- x + 1
fimenquanto
bol <- (bol - 1)
y <- y + 1
fimenquanto


total <- somabt + somatet

escreval ("O n�mero de bolas na base do tetraedro �:", somabt)

 escreval ("Tentei muito, por�m n�o consegui resolver todo o problema, apenas achar a base do tetraedro")




Fimalgoritmo