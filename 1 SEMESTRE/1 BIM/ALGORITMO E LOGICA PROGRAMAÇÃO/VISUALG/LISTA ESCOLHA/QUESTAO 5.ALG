Algoritmo "QUESTAO 5"

Var
km : real
tip : caracter

Inicio
escreval ("Informe a dist�ncia do percurso")
 leia (km)
escreval ("Informe o tipo de carro A, B, C")
 leia (tip)
 escolha (tip)
 
  caso "A"
  escreval ("Seu carro consumir�:", km/12:8:1," litros nesse percurso")
  
  caso "B"
  escreval ("Seu carro consumir�:", km/9:8:1," litros nesse percurso")
  
  caso "C"
  escreval ("Seu carro consumir�:", km/8:8:1," litros nesse percurso")
  
  outrocaso
  escreval ("Tipo de carro inv�lido")
  
  
  fimescolha

Fimalgoritmo