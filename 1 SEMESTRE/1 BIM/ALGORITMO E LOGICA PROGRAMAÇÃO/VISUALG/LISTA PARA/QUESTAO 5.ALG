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
escreval ("Informe quantos n�meros deseja digitar")
 leia (cont)
 para x de 1 ate cont passo 1 faca
  escreval ("Informe o", x,"� n�mero")
  leia (num)
  se (num > maior) entao
  maior <- num
  senao
  menor <- num
  fimse
  fimpara
  escreval ("O maior n�mero �:", maior)
  escreval ("O menor n�mero �:", menor)




Fimalgoritmo