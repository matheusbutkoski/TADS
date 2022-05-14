Algoritmo "CALCULO ELEITORES 9 "

Var
  eleitores , nulos , brancos , validos : inteiro
  pbrancos , pnulos , pvalidos : real
Inicio
   escreval("Quantidade de Eleitores")
   leia(eleitores)
   escreval("Quantidade de votos brancos")
   leia(brancos)
   escreval("Quantidade de nulos")
   leia(nulos)
   escreval("Quantidade de validos")
   leia(validos)
pbrancos <- (brancos * 100/eleitores)
pnulos <- (nulos * 100/eleitores)
pvalidos <- (validos * 100/eleitores)
escreval ("Percentual de votos brancos =", pbrancos, "%")
escreval ("Percentual de votos nulos =", pnulos, "%")
escreval ("Percentual de votos validos =", pvalidos, "%")



Fimalgoritmo