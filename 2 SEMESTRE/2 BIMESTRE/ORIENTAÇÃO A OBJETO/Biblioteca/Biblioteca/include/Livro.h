#ifndef LIVRO_H
#define LIVRO_H
#include <string>
using namespace std;

class Livro
{
    public:
        Livro();
        virtual ~Livro();

        string Gettitulo(){
            return titulo;
        }
        void Settitulo(string tit) { titulo = tit; }
        string Getautor(){
            return autor;
        }
        void Setautor(string aut) { autor = aut; }
        string Geteditora(){
            return editora;
        }
        void Seteditora(string edit) { editora = edit; }
        string GetISBN(){
            return ISBN;
        }
        void SetISBN(string ISBN) { ISBN = ISBN; }
        int Getcodigo(){
            return codigo;
        }
        void Setcodigo(int cod) { codigo = cod; }
        int Getano(){
            return ano;
        }
        void Setano(int a) { ano = a; }
        int Getedicao(){
            return edicao;
        }
        void Setedicao(int edic) { edicao = edic; }

    protected:

    private:
        string titulo;
        string autor;
        string editora;
        string ISBN;
        int codigo;
        int ano;
        int edicao;
};

#endif // LIVRO_H
