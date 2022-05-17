#ifndef DATA_H
#define DATA_H


class Data
{
    public:
        Data();

        int Getano() { return ano; }
        void Setano(int val) { ano = val; }
        int Getmes() { return mes; }
        void Setmes(int val) { mes = val; }
        int Getdia() { return dia; }
        void Setdia(int val) { dia = val; }

    protected:

    private:
        int ano;
        int mes;
        int dia;
};

#endif // DATA_H
