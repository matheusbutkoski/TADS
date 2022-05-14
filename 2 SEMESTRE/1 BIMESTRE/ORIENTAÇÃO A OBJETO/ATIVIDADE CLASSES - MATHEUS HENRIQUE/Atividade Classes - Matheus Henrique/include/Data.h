#ifndef DATA_H
#define DATA_H


class Data
{
    public:
        Data();
        virtual ~Data();

        int Getdia() { return dia; }
        void Setdia(int val) { dia = val; }

        int Getmes() { return mes; }
        void Setmes(int val) { mes = val; }

        int Getano() { return ano; }
        void Setano(int val) { ano = val; }

    protected:

    private:
        int dia;
        int mes;
        int ano;
};

#endif // DATA_H
