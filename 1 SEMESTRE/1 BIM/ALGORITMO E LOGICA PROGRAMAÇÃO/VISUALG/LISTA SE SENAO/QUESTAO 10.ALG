Algoritmo "semnome"

Var
sal : real
Inicio

escreval ("Digite o valor de seu sal�rio")
 leia(sal)
 
se (sal <= 600) entao
 escreval ("Voc� est� isento do desconto do INSS")
fimse

se (sal > 600) e (sal <= 1200) entao
 escreval ("O desconto do INSS em seu sal�rio � de:", sal * 0.20)
fimse

se (sal > 1200) e (sal < 2000) entao
 escreval ("O desconto do INSS em seu sal�rio � de:", sal * 0.25)
fimse

se (sal >= 2000) entao
 escreval ("O desconto do INSS em seu sal�rio � de:", sal * 0.30)
fimse

Fimalgoritmo