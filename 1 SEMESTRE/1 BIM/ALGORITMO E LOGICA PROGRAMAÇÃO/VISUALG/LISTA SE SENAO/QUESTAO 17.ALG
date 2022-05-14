Algoritmo "QUESTAO 17"
Var
dia, mes, ano : inteiro
Inicio
escreval ("Qual o dia do seu aniversário?")
 leia(dia)
escreval ("Qual o mes do seu aniversário?")
 leia(mes)
escreval ("Qual o ano do seu aniversário?")
 leia(ano)
 
se (dia > 31) entao
 escreval ("Data inválida por: Dia inexistente")
fimse

se (mes > 12) entao
 escreval ("Data inválida por: Mês inexistente")
fimse

se (ano > 2018) entao
 escreval ("Data inválida por : Ano inexistente")
fimse

se (dia <= 31) e (mes <= 12) e (ano <= 2018) entao
 escreval ("Data válida")
fimse









Fimalgoritmo