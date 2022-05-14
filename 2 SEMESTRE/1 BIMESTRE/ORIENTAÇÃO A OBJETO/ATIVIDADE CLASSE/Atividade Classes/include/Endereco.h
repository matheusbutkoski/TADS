#ifndef ENDERECO_H
#define ENDERECO_H
#include <string>

using namespace std;

class Endereco
{
    public:
        Endereco();
        Endereco(string c, string r, int num);
        ~Endereco();

        void setEnd(string c, string r, int num);

        string Getcidade();
        void Setcidade(string val);

        string Getrua();
        void Setrua(string val);

        int Getnumero();
        void Setnumero(int val);

    protected:

    private:
        string cidade;
        string rua;
        int numero;
};

#endif // ENDERECO_H
