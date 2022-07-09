#ifndef DATA_H
#define DATA_H
using namespace std;

class Data
{
    public:
        Data();
        virtual ~Data();

        int Getdia(){
            return dia;
        }

        void Setdia(int dia) {
            this->dia = dia;
        }

        int Getmes(){
            return mes;
        }

        void Setmes(int mes) {
            this->mes = mes;
        }
        int Getano(){
            return ano;
        }

        void Setano(int ano) {
            this->ano = ano;
        }

    protected:

    private:
        int dia;
        int mes;
        int ano;
};

#endif // DATA_H
