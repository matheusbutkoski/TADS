Algoritmo "semnome"

Var
peso : real
plan : inteiro


Inicio
escreval ("Informe seu peso")
 leia (peso)
escreval ("Informe em qual planeta deseja ver seu peso")
escreval ("1 - Mercúrio")
escreval ("2 - Vênus")
escreval ("3 - Marte")
escreval ("4 - Júpiter")
escreval ("5 - Saturno")
escreval ("6 - Urano")
 leia (plan)
 escolha (plan)
 
   caso 1
  escreval ("Seu peso é em Mercúrio é:", peso/10 * 0.37)
  
   caso 2
  escreval ("Seu peso é em Vênus é:", peso/10 * 0.88)
  
   caso 3
  escreval ("Seu peso é em Marte é:", peso/10 * 0.38)
  
   caso 5
  escreval ("Seu peso é em Júpiter é:", peso/10 * 2.64)
  
   caso 6
  escreval ("Seu peso é em Saturno é:", peso/10 * 1.15)
  
   caso 7
  escreval ("Seu peso é em Urano é:", peso/10 * 1.17)
  
  fimescolha
  




Fimalgoritmo


