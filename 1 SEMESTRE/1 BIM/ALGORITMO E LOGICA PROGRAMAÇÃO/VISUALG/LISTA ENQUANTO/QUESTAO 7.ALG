Algoritmo "QUESTAO 7"
Var
x : inteiro
soma : real
Inicio
x <- 1
enquanto (x <= 500) faca
 se (x mod 2 <> 0) e (x mod 3 = 0) entao
 soma <- soma + x
 fimse
 x <- x + 1
 fimenquanto
  escreval ("A soma dos números impares divisiveis por 3 é:", soma)


Fimalgoritmo