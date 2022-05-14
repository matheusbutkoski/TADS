#ifndef ENDERECO_H
#define ENDERECO_H
#include <string>

using namespace std;


class Endereco
{
    public:
        Endereco();

        string Getcidade() { return cidade; }
        void Setcidade(string val) { cidade = val; }

        string Getrua() { return rua; }
        void Setrua(string val) { rua = val; }

        int Getnumero() { return numero; }
        void Setnumero(int val) { numero = val; }

    protected:

    private:
        string cidade;
        string rua;
        int numero;
};

#endif // ENDERECO_H
