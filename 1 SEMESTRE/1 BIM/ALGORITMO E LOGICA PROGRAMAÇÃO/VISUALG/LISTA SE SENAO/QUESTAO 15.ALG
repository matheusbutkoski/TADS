Algoritmo "QUESTAO 15"
Var
sal : real
Inicio
escreval ("Informe o seu sal�rio")
 leia(sal)
 
 se (sal <= 280) entao
 escreval ("O seu sal�rio de ", sal," sofrer� reajuste de 20% e resultar� em", sal * 1.20)
 fimse
 
 se (sal > 280) e (sal <= 700) entao
  escreval ("O seu sal�rio de ", sal," sofrer� reajuste de 15% e resultar� em", sal * 1.15)
 fimse
 
 se (sal > 700) e (sal <= 1500) entao
  escreval ("O seu sal�rio de ", sal," sofrer� reajuste de 10% e resultar� em", sal * 1.10)
 fimse
 
 se (sal > 1500) entao
  escreval ("O seu sal�rio de ", sal," sofrer� reajuste de 5% e resultar� em", sal * 1.05)
 fimse








Fimalgoritmo