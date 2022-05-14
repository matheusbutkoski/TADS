#include <iostream>
#include <Data.h>
#include <Endereco.h>
#include <Pessoa.h>
#include <string>

using namespace std;

int main()
{
    Data dataNasc;
    int ano, mes, dia;

    Endereco ende;
    string cidade, rua;
    int numero;

    Pessoa aluno;
    string nome;
    int ra;

    cout << "Informe a data de nascimento" << endl;
    cin >> dia;
    cin >> mes;
    cin >> ano;

    dataNasc.Setdia(dia);
    dataNasc.Setmes(mes);
    dataNasc.Setano(ano);


    cout << "Informe o endereco" << endl;
    cout << "Cidade:" << endl;
    cin >> cidade;
    cout << "Rua:" << endl;
    cin >> rua;
    cout << "Numero:" << endl;
    cin >> numero;

    ende.Setcidade(cidade);
    ende.Setrua(rua);
    ende.Setnumero(numero);

    cout << "Informe o nome do aluno" << endl;
    cin >> nome;
    cout << "Informe o RA do aluno" << endl;
    cin >> ra;

    aluno.Setnome(nome);
    aluno.Setra(ra);

    cout << "Nome: " << aluno.Getnome() << endl;
    cout << "RA: " << aluno.Getra() << endl;

    cout << "Dia: " << dataNasc.Getdia() << endl;
    cout << "Mes: " << dataNasc.Getmes() << endl;
    cout << "Ano: " << dataNasc.Getano() << endl;

    cout << "Cidade: " << ende.Getcidade() << endl;
    cout << "Rua: " << ende.Getrua() << endl;
    cout << "Numero: " << ende.Getnumero() << endl;




    return 0;
}
