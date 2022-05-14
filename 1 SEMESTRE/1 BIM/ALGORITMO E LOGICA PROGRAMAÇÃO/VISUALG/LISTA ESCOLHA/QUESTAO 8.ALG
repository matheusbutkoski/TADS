Algoritmo "QUESTAO 8"

Var
dep : real
saque : real
saldo: real
esc : caracter
conta : real


Inicio
conta <- 1000
escreval ("Gostaria de realizar um saque ou depósito - S ou D")
 leia (esc)
 escolha (esc)
 
  caso "S"
  escreval ("Quanto gostaria de sacar")
   leia (saque)
   conta <- conta - saque
   
  caso "D"
   escreval ("Quanto gostaria de depositar")
    leia (dep)
    conta <- conta + dep
    
  fimescolha
  
  escreval ("Seu saldo final é:", conta)

 


Fimalgoritmo