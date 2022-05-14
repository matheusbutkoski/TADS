#ifndef EMPRESTIMO_H
#define EMPRESTIMO_H
#include "Data.h"
#include <string>


class Emprestimo
{
    public:
        Emprestimo();

        int Getsituacao() { return situacao; }
        void Setsituacao(int val) { situacao = val; }

        Data GetdataEmprestimo() { return dataEmprestimo; }
        void SetdataEmprestimo(Data val) { dataEmprestimo = val; }

        Data GetdataDevolucaoPrev() { return dataDevolucaoPrev; }
        void SetdataDevolucaoPrev(Data val) { dataDevolucaoPrev = val; }

        Data GetdataDevolucaoReal() { return dataDevolucaoReal; }
        void SetDataDevolucaoReal(Data val) { dataDevolucaoReal = val; }

    private:
        Data dataEmprestimo;
        Data dataDevolucaoPrev;
        Data dataDevolucaoReal;
        int situacao;
};

#endif // EMPRESTIMO_H
