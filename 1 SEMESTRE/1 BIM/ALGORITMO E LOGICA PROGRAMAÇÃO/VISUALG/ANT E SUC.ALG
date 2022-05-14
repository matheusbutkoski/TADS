Algoritmo "ANT E SUC"

Var
opcao : caracter
num, ant, suc : inteiro
Inicio
opcao <- "S"
enquanto (opcao = "S") faça
 escreval ("Informe o Número")
  leia (num)
 ant <- num - 1
 suc <- num + 1
 escreval ("O Antecessor é:", ant," e o Sucessor é:", suc)
 escreval ("Deseja verificar outro número S ou N")
  leia (opcao)
 fimenquanto




Fimalgoritmo