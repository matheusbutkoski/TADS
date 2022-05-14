#ifndef DATA_H
#define DATA_H


class Data
{
    public:
        Data();
        Data(int d, int m, int a);
        ~Data();

        void setarDados(int d, int m, int a);

        int Getdia();
        void Setdia(int val);

        int Getmes();
        void Setmes(int val);

        int Getano();
        void Setano(int val);

    protected:

    private:
        int dia;
        int mes;
        int ano;
};

#endif // DATA_H
