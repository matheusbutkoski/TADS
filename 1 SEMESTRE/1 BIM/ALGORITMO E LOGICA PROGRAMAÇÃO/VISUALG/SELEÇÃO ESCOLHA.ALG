Algoritmo "semnome"

Var
voto, contF1, contF2, contF3, contFB, contFN : inteiro
opcao : caracter
Inicio
opcao <- "S"
enquanto (opcao = "S") ou (opcao = "s") faca
escreval ("Informe seu voto")
escreval ("1 - Fulano 1")
escreval ("2 - Fulano 2")
escreval ("3 - Fulano 3")
escreval ("4 - Nulo")
escreval ("5 - Branco")
leia (voto)
escolha (voto)

  caso 1
   contF1 <- contF1 + 1
     escreval ("Voto computado: Fulano 1")

  caso 2
   contF2 <- contF2 + 1
     escreval ("Voto computado: Fulano 2")

   caso 3
   contF3 <- contF3 + 1
     escreval ("Voto computado: Fulano 3")

   caso 4
   contFB <- contFB + 1
     escreval ("Voto computado: Branco")

   caso 5
   contFN <- contFN + 1
     escreval ("Voto computado: Nulo")
   outrocaso
     escreval ("Opção inválida")
fimescolha
     escreval ("Deseja realizar mais um voto? S / N")
leia (opcao)
fimenquanto
     escreval ("RESULTADO:")
     escreval ("Fulano 1 = ", contF1)
     escreval ("Fulano 2 = ", contF2)
     escreval ("Fulano 3 = ", contF3)
     escreval ("Brancos = ", contFB)
     escreval ("Nulos = ", contFN)


Fimalgoritmo