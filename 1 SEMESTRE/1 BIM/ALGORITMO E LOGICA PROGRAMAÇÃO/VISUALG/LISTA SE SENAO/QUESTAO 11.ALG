Algoritmo "QUESTAO 11"

Var
nome : caracter
numE : inteiro
numV : inteiro


Inicio
escreval ("Escreva o nome da sua cidade")
 leia(nome)
escreval ("Quantos eleitores aptos possui sua cidade")
 leia(numE)
escreval ("Qual a porcentagem do candidato mais votado")
 leia(numV)
se (numE >= 20000) e (numV < 50) entao
 escreval("A cidade de ", nome, " ter� segundo turno nas elei��es")
senao
 escreval("A cidade de ", nome," n�o ter� segundo turno nas elei��es")
fimse



Fimalgoritmo