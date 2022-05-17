#ifndef USUARIO_H
#define USUARIO_H
#include <string>

using namespace std;
class Usuario
{
    public:
        Usuario();

        string Getnome() { return nome; }
        void Setnome(string val) { nome = val; }

        string Gettelefone() { return telefone; }
        void Settelefone(string val) { telefone = val; }

        int Getmatricula() { return matricula; }
        void Setmatricula(int val) { matricula = val; }

        string Getcpf() { return cpf; }
        void Setcpf(string val) { cpf = val; }

    protected:

    private:
        string nome;
        string telefone;
        int matricula;
        string cpf;
};



#endif // USUARIO_H
