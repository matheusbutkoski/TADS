Algoritmo "QUESTAO 16"
Var
x : inteiro
resp : caracter
Inicio
x <- 0
escreval ("Telefonou para a vítima? S ou N")
 leia (resp)
 se (resp = "s") entao
  x <- x + 1
 fimse
 
escreval ("Esteve no local do crime? S ou N")
 leia (resp)
 se (resp = "s") entao
  x <- x + 1
 fimse
 
escreval ("Mora perto da vítima? S ou N")
 leia (resp)
 se (resp = "s") entao
  x <- x + 1
 fimse
 
escreval ("Devia para a vítima? S ou N")
 leia (resp)
 se (resp = "s") entao
  x <- x + 1
 fimse
 
escreval ("Já trabalhou com a vítima? S ou N")
 leia (resp)
 se (resp = "s") entao
  x <- x + 1
 fimse

se(x = 2) entao
 escreval ("Suspeito")
senao
 se (x = 3) ou (x = 4) entao
 escreval ("Cúmplice")
senao
 se (x = 5) entao
  escreval ("Assassino")
senao
 se (x <= 1) entao
  escreval ("Inocente")
 fimse
 fimse
 fimse
 fimse





Fimalgoritmo