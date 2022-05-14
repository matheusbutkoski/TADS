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

        int Getano_lancamento() { return ano_lancamento; }
        void Setano_lancamento(int val) { ano_lancamento = val; }

        int Getedicao() { return edicao; }
        void Setedicao(int val) { edicao = val; }

        string Geteditora() { return editora; }
        void Seteditora(string val) { editora = val; }

        string GetISBN() { return ISBN; }
        void SetISBN(string val) { ISBN = val; }

        int Getstatus() { return status; }
        void Setstatus(int val) { status = val; }

    protected:

    private:
        int codigo, ano_lancamento, edicao, status;
        string titulo, autor, editora, ISBN;
};

#endif // LIVRO_H
