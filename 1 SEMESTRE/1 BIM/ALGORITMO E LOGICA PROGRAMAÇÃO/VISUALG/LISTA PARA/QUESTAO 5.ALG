Algoritmo "QUESTAO 5"

Var
cont : inteiro
maior : inteiro
menor : inteiro
x : inteiro
num : inteiro
Inicio
maior <- 1
menor <- 1
escreval ("Informe quantos números deseja digitar")
 leia (cont)
 para x de 1 ate cont passo 1 faca
  escreval ("Informe o", x,"º número")
  leia (num)
  se (num > maior) entao
  maior <- num
  senao
  menor <- num
  fimse
  fimpara
  escreval ("O maior número é:", maior)
  escreval ("O menor número é:", menor)




Fimalgoritmo