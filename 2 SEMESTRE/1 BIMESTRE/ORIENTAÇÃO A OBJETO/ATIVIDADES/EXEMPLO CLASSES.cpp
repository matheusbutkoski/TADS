#include <iostream>
#include <string>
#include <locale>

using namespace std;

class Aluno{
private:
    string nome;
    int ra;
    int ano;
    int mes;
    int dia;

public:

    //Construtor Default
    Aluno(){
    }

    //Construtor Default
    Aluno(string n, int r ){
        nome = n;
        ra = r;
    }

    //Construtor Default
    Aluno(string n, int r, int a, int m, int d ){
        nome = n;
        ra=r;
        ano = a;
        mes = m;
        dia = d;
    }

    string getNome(){
        return nome;
    }

    void setNome(string n){
        nome = n;
    }

    int getRa(){
        return ra;
    }

    void setRa(int ra){
        ra = ra;
    }

    int getAno(){
        return ano;
    }

    void setAno(int a){
        ano = a;
    }

    int getMes(){
        return mes;
    }

    void setMes(int m){
        mes = m;
    }

    int getDia(){
        return dia;
    }

    void setDia(int d){
        dia = d;
    }

    int calcularIdade(int anoAtual, int mesAtual, int diaAtual){
        int diasDataNasc = ano * 365 + mes * 30 + dia;
        int diasDataAtual = anoAtual * 365 + mesAtual * 30 + diaAtual;
        int idade = diasDataAtual - diasDataNasc;
        idade = idade/365;
        return idade;
    }

};

int main(){

    Aluno aluno("Andr�", 1, 1990, 1, 10);
    cout << "idade: " << aluno.calcularIdade(2022, 3, 28);

    return 0;
}
