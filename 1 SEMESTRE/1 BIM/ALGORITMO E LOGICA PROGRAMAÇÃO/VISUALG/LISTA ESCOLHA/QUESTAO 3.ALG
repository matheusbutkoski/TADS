Algoritmo "QUESTAO 3"
Var
esc : caracter
raio : real
base : real
altura : real
lado : real

Inicio
escreval ("Informe qual deseja calcular")
escreval ("C – área de um círculo")
escreval ("R - área de um retângulo")
escreval ("Q - área de um quadrado")
leia (esc)
escolha (esc)

 caso "C"
escreval ("Informe o Raio do Círculo")
leia (raio)
escreval ("A área da circunferência é:", raio^2 * pi:8:1)

 caso "R"
escreval ("Informe a Base do Retângulo")
 leia (base)
escreval ("Informe o Lado do Retângulo")
 leia (altura)
escreval ("A Área do Retângulo é de:", base * altura)

 caso "Q"
escreval ("Informe o Lado do Quadrado")
 leia (lado)
escreval ("A Área do Quadrado é de:", lado^2)
fimescolha
Fimalgoritmo