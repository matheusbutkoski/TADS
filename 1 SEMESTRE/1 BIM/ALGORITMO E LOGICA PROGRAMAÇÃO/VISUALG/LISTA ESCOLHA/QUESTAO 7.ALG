Algoritmo "semnome"

Var
peso : real
plan : inteiro


Inicio
escreval ("Informe seu peso")
 leia (peso)
escreval ("Informe em qual planeta deseja ver seu peso")
escreval ("1 - Merc�rio")
escreval ("2 - V�nus")
escreval ("3 - Marte")
escreval ("4 - J�piter")
escreval ("5 - Saturno")
escreval ("6 - Urano")
 leia (plan)
 escolha (plan)
 
   caso 1
  escreval ("Seu peso � em Merc�rio �:", peso/10 * 0.37)
  
   caso 2
  escreval ("Seu peso � em V�nus �:", peso/10 * 0.88)
  
   caso 3
  escreval ("Seu peso � em Marte �:", peso/10 * 0.38)
  
   caso 5
  escreval ("Seu peso � em J�piter �:", peso/10 * 2.64)
  
   caso 6
  escreval ("Seu peso � em Saturno �:", peso/10 * 1.15)
  
   caso 7
  escreval ("Seu peso � em Urano �:", peso/10 * 1.17)
  
  fimescolha
  




Fimalgoritmo


