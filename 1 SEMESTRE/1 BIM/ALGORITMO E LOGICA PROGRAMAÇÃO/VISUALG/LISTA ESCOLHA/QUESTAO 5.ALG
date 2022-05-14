Algoritmo "QUESTAO 5"

Var
km : real
tip : caracter

Inicio
escreval ("Informe a distância do percurso")
 leia (km)
escreval ("Informe o tipo de carro A, B, C")
 leia (tip)
 escolha (tip)
 
  caso "A"
  escreval ("Seu carro consumirá:", km/12:8:1," litros nesse percurso")
  
  caso "B"
  escreval ("Seu carro consumirá:", km/9:8:1," litros nesse percurso")
  
  caso "C"
  escreval ("Seu carro consumirá:", km/8:8:1," litros nesse percurso")
  
  outrocaso
  escreval ("Tipo de carro inválido")
  
  
  fimescolha

Fimalgoritmo