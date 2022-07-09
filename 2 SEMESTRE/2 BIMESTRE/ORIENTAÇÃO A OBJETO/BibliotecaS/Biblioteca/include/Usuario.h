#ifndef USUARIO_H
#define USUARIO_H
#include <string>
#include "Livro.h"
#include "Emprestimo.h"
using namespace std;

class Usuario
{
    public:
        Usuario();
        virtual ~Usuario();

        string Getnome(){
            return nome;
        }
        void Setnome(string nm) { nome = nm; }
        string Gettelefone(){
            return telefone;
        }
        void Settelefone(string tel) { telefone = tel; }
        string Getmatricula(){
            return matricula;
        }
        void Setmatricula(string mat) {matricula = mat; }
        int Getcpf(){
            return cpf;
        }
        void Setcpf(int cpf) {
            this->cpf = cpf;
        }

    protected:

    private:
        string nome;
        string telefone;
        string matricula;
        int cpf;
};


#endif // USUARIO_H
