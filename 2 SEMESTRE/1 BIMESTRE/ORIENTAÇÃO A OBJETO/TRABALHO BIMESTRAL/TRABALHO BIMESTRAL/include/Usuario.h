#ifndef USUARIO_H
#define USUARIO_H
#include <string>


class Usuario
{
    public:
        Usuario();

        string Getnome() { return nome; }
        void Setnome(string val) { nome = val; }
        string Getcpf() { return int; }
        void Setcpf(cpf val) { int = val; }
        string Gettelefone() { return telefone; }
        void Settelefone(string val) { telefone = val; }
        string Getmatricula() { return matricula; }
        void Setmatricula(string val) { matricula = val; }

    protected:

    private:
        string nome;
        string int;
        string telefone;
        string matricula;
};

#endif // USUARIO_H
