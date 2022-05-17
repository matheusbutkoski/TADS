#ifndef EMPRESTIMO_H
#define EMPRESTIMO_H
#include "Data.h"
#include "Livro.h"
#include "Usuario.h"
#include <string>

using namespace std;

class Emprestimo
{
    public:
        Emprestimo();

        int GetcodigoEmprestimo() { return codigoEmprestimo; }
        void SetcodigoEmprestimo(int val) { codigoEmprestimo = val; }

        int Getsituacao() { return situacao; }
        void Setsituacao(int val) { situacao = val; }

        Data GetdataEmprestimo() { return dataEmprestimo; }
        void SetdataEmprestimo(Data val) { dataEmprestimo = val; }

        Data GetdataDevolucaoPrev() { return dataDevolucaoPrev; }
        void SetdataDevolucaoPrev(Data val) { dataDevolucaoPrev = val; }

        Data GetdataDevolucaoReal() { return dataDevolucaoReal; }
        void SetDataDevolucaoReal(Data val) { dataDevolucaoReal = val; }

        Usuario Getaluno() { return aluno; }
        void Setaluno(Usuario val) { aluno = val; }

        Livro Getlivro() { return livro; }
        void Setlivro(Livro val) { livro = val; }






    private:
        int codigoEmprestimo;
        Data dataEmprestimo;
        Data dataDevolucaoPrev;
        Data dataDevolucaoReal;
        Usuario aluno;
        Livro livro;
        int situacao;
};

#endif // EMPRESTIMO_H
