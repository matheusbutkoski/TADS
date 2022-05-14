
#include <string>
#include <iostream>

using namespace std;

int main(){

int i, j, esc, x=0;
char op;

struct aluno{

    string nome;
    int ra;

}dados[100];

for(j=0; j=1; j++){
cout << "Escolha o que deseja fazer" << endl;
cout << "1 - Cadastrar Aluno" << endl;
cout << "2 - Pesquisar Aluno pelo RA" << endl;
cout << "3 - Listar todos os alunos cadastrados" << endl;
cout << "4 - Editar registro de aluno" << endl;
cout << "5 - Sair" << endl;
cin >> esc;



if (esc==1){

        for(i=0; i<100; i++){
        cout << "Informe o Nome do Aluno" << endl;
        cin >> dados[i].nome;



        cout << "Informe o RA do Aluno" << endl;
        cin >> dados[i].ra;

        cout << "Aluno Cadastrado!" << endl;
        cout << "-------------------" << endl;
        x++;
        cout << "Deseja cadastrar outro aluno? S/N" << endl;
        cin >> op;

        if(op != 'S'){

        i=100;
        j=1;
        }
        }
            }

if (esc==2){

   int pesq, cont=0;

   cout << "Informe o RA que deseja procurar" << endl;
    cin >> pesq;

    for(i=0;i<100;i++){


   if(pesq == dados[i].ra){
        cout << "-------------------" << endl;
        cout << "Aluno Encontrado!" << endl;
        cout << "Nome: " << dados[i].nome << endl;
        cout << "RA: " << dados[i].ra << endl;
        cout << "-------------------" << endl;

}
}
}

if (esc==3){
        cout << "-------------------" << endl;
        for(i=0;i<x;i++){

        cout << "Nome: " << dados[i].nome << endl;
        cout << "RA: " << dados[i].ra << endl;
        cout << "-------------------" << endl;
}
}

if (esc==4){
    int edit, era;
    string enome;
        cout << "Informe o RA do aluno que deseja editar" << endl;
        cin >> edit;

        for(i=0; i<100; i++){
        if(edit == dados[i].ra){
        cout << "-------------------" << endl;
        cout << "Aluno Encontrado!" << endl;
        cout << "Nome: " << dados[i].nome << endl;
        cout << "RA: " << dados[i].ra << endl;
        cout << "-------------------" << endl;

        cout << "Digite o novo NOME" << endl;
        cin >> dados[i].nome;

        cout << "Digite o novo RA" << endl;
        cin >> era;
        dados[i].ra = era;
        cout << "Edicao Concluida!" << endl;
        cout << "-------------------" << endl;
        break;
}
}
}
if (esc==5){
    system("pause");
    break;
}
}
}

