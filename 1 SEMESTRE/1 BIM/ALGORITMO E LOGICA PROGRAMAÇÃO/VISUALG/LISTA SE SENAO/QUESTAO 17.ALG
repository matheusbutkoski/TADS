Algoritmo "QUESTAO 17"
Var
dia, mes, ano : inteiro
Inicio
escreval ("Qual o dia do seu anivers�rio?")
 leia(dia)
escreval ("Qual o mes do seu anivers�rio?")
 leia(mes)
escreval ("Qual o ano do seu anivers�rio?")
 leia(ano)
 
se (dia > 31) entao
 escreval ("Data inv�lida por: Dia inexistente")
fimse

se (mes > 12) entao
 escreval ("Data inv�lida por: M�s inexistente")
fimse

se (ano > 2018) entao
 escreval ("Data inv�lida por : Ano inexistente")
fimse

se (dia <= 31) e (mes <= 12) e (ano <= 2018) entao
 escreval ("Data v�lida")
fimse









Fimalgoritmo