Algoritmo "QUESTAO 3"
Var
esc : caracter
raio : real
base : real
altura : real
lado : real

Inicio
escreval ("Informe qual deseja calcular")
escreval ("C � �rea de um c�rculo")
escreval ("R - �rea de um ret�ngulo")
escreval ("Q - �rea de um quadrado")
leia (esc)
escolha (esc)

 caso "C"
escreval ("Informe o Raio do C�rculo")
leia (raio)
escreval ("A �rea da circunfer�ncia �:", raio^2 * pi:8:1)

 caso "R"
escreval ("Informe a Base do Ret�ngulo")
 leia (base)
escreval ("Informe o Lado do Ret�ngulo")
 leia (altura)
escreval ("A �rea do Ret�ngulo � de:", base * altura)

 caso "Q"
escreval ("Informe o Lado do Quadrado")
 leia (lado)
escreval ("A �rea do Quadrado � de:", lado^2)
fimescolha
Fimalgoritmo