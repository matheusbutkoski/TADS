#include <iostream>
#include <string>
#include "Pessoa.h"
#include "Endereco.h"
#include "Data.h"

using namespace std;

int main()
{
    int dia, mes, ano, num, ra;
    string cidade, nome, rua;

    Pessoa p ;
    Data d;
    Endereco e;
    string aux;


    cout << "Informe o Nome do aluno" << endl;
    cin >> nome;
    cout << "Informe o RA do aluno" << endl;
    cin >> ra;
    cout << "Informe o dia de nascimento " << endl;
    cin >> dia;
    cout << "Informe o mes de nascimento " << endl;
    cin >> mes;
    cout << "Informe o ano de nascimento " << endl;
    cin >> ano;
    cout << "Informe o endereco " << endl;
    cout << "Informe a cidade" << endl;
    cin >> cidade;
    cout << "Informe o bairro" << endl;
    cin >> rua;
    cout << "Informe o numero" << endl;
    cin >> num;

    d.Setdia(dia);
    d.Setmes(mes);
    d.Setano(ano);

    e.Setcidade(cidade);
    e.Setrua(rua);
    e.Setnumero(num);

    p.Setnome(nome);
    p.Setra(ra);
    p.SetdataNasc(d);
    p.SetenderecoRes(e);

    cout << "Nome: " << p.Getnome() << endl;
    cout << "Ra: " << p.Getra() << endl;
    cout << "Data Nascimento: " << p.GetdataNasc().Getdia() << "/" << p.GetdataNasc().Getmes() << "/" << p.GetdataNasc().Getano() << endl;
    cout << "Endereco: " << endl;
    cout << "Cidade:" << p.GetenderecoRes().Getcidade() << endl;
    cout << "Bairro:" << p.GetenderecoRes().Getrua() << endl;
    cout << "Numero:" << p.GetenderecoRes().Getnumero() << endl;
    return 0;
}
