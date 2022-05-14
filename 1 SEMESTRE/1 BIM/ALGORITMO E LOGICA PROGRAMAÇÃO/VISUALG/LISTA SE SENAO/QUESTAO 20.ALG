Algoritmo "QUESTAO 20"

Var
lit : real
tiP : caracter

Inicio
escreval ("Informe quanto foi abastecido em litros")
 leia (lit)
escreval ("Informe qual tipo de combustível G ou E")
 leia (tiP)
se (tiP = "G") entao
   se (lit <= 20) entao
    escreval ("O valor a ser pago é de", lit * 4.268)
    senao
    escreval ("O valor a ser pago é de", lit * 4.18)
    fimse
    fimse

se (tiP = "E") entao
    se (lit <= 20) entao
    escreval ("O valor a ser pago é de", lit * 2.784)
   senao
    escreval ("O valor a ser pago é de", lit * 2.726)
   fimse
   fimse





Fimalgoritmo