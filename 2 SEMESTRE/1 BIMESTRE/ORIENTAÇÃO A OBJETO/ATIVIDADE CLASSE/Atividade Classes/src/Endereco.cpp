#include "Endereco.h"
#include <string>

using namespace std;

Endereco::Endereco()
{
    numero = 1;
}

Endereco::Endereco(string c, string r, int num)
{
    cidade = c;
    rua = r;
    numero = num;

}

Endereco::~Endereco()
{
    //dtor
}

string Endereco::Getcidade(){
    return cidade;
}
void Endereco::Setcidade(string val){
    cidade = val;
}

string Endereco::Getrua(){
    return rua;
}
void Endereco::Setrua(string val){
    rua = val;
}

int Endereco::Getnumero(){
    return numero;
}
void Endereco::Setnumero(int val){
    numero = val;
}
