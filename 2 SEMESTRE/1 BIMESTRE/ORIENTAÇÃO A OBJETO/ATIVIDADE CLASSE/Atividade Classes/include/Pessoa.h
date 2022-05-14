#ifndef PESSOA_H
#define PESSOA_H
#include "Data.h"
#include "Endereco.h"
#include <string>

using namespace std;

class Pessoa
{
    public:
        Pessoa();

        string Getnome(){
             return nome;
        }
        void Setnome(string val){
             nome = val;
        }

        int Getra(){
            return ra;
        }
        void Setra(int val){
            ra = val;
        }

        Data GetdataNasc(){
            return dataNasc;
        }
        void SetdataNasc(Data d){
        dataNasc = d;
        }

        Endereco GetenderecoRes(){
        return enderecoRes;
        }

        void SetenderecoRes(Endereco e){
        enderecoRes = e;
        }

    protected:

    private:
        string nome;
        int ra;
        Data dataNasc;
        Endereco enderecoRes;
};

#endif // PESSOA_H
