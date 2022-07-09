#ifndef EMPRESTIMO_H
#define EMPRESTIMO_H
#include <string>
#include "Data.h"

using namespace std;


class Emprestimo
{
    public:
        Emprestimo();
        virtual ~Emprestimo();

        int Getsituacao(){
            return situacao;
        }
        void Setsituacao(int sit) { situacao = sit; }

        Data Getdataemp(){
            return dataemp;
        }

        void Setdataemp(Data dataemp){
            this->dataemp = dataemp;
        }

        Data Getdataprev(){
            return dataprev;
        }
        void Setdataprev(Data dataprev){
            this->dataprev = dataprev;
        }

        Data Getdataentre(){
            return dataentre;
        }
        void Setdataentre(Data dataentre){
            this->dataentre = dataentre;
        }

    protected:

    private:
        int situacao;
        Data dataemp;
        Data dataprev;
        Data dataentre;
};

#endif // EMPRESTIMO_H
