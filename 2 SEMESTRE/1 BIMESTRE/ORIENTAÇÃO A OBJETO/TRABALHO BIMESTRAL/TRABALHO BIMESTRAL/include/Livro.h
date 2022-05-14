#ifndef LIVRO_H
#define LIVRO_H
#include <string>

using namespace std;

class Livro
{
    public:
        Livro();

        int Getcodigo() { return codigo; }
        void Setcodigo(int val) { codigo = val; }
        string Gettitulo() { return titulo; }
        void Settitulo(string val) { titulo = val; }
        string Getautor() { return autor; }
        void Setautor(string val) { autor = val; }
        int Getano() { return ano; }
        void Setano(int val) { ano = val; }
        int Getedicao() { return edicao; }
        void Setedicao(int val) { edicao = val; }
        string Geteditora() { return editora; }
        void Seteditora(string val) { editora = val; }
        string GetISBN() { return ISBN; }
        void SetISBN(string val) { ISBN = val; }

    protected:

    private:
        int codigo;
        string titulo;
        string autor;
        int ano;
        int edicao;
        string editora;
        string ISBN;
};

#endif // LIVRO_H
