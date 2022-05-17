#include <iostream>
#include <string>
#include "Usuario.h"
#include "Emprestimo.h"
#include "Livro.h"

using namespace std;

//ALUNOS: MATHEUS HENRIQUE E GUSTAVO PERUZZO

int main(){

int op, op2, cont_usu=0, cont_liv=0, cont_emp=0, cod_livro, ano_lan, edi, busca_livro, ano, mes, dia, mat, busca, cont_busca=0, i;
string nome, cpf, tel, titulo, aut, edit, isbn;
char op_livro;

Usuario u[50];
Emprestimo e[100];
Livro l[50];
Data d;

for(int i=0;i<50;i++){
    u[i].Setmatricula(0);
    l[i].Setcodigo(0);
}


do{
    cout << "----------------------------" << endl;
    cout << "ESCOLHA UMA OPCAO" << endl;
    cout << "1 - CADASTRAR E EDITAR ALUNO" << endl;
    cout << "2 - CADASTRAR E EDITAR LIVRO" << endl;
    cout << "3 - PESQUISAR ALUNO" << endl;
    cout << "4 - PESQUISAR LIVRO" << endl;
    cout << "5 - REALIZAR EMPRESTIMO" << endl;
    cout << "6 - REALIZAR DEVOLUCAO" << endl;
    cout << "7 - GERAR RELATORIO" << endl;
    cout << "8 - SAIR" << endl;
    cout << "----------------------------" << endl;
    cin >> op;
    system("@cls||clear");
    switch(op){


case 1://cadastrar e editar aluno
    cout << "Deseja Cadastrar ou Editar Aluno" << endl;
    cout << "1 - Cadastrar" << endl;
    cout << "2 - Editar" << endl;
    cin >> op2;
       if(op2 == 1){//cadastrar aluno

        cout << "Informe o Nome do Aluno" << endl;
        while(getline(cin, nome)){
            if(nome != ""){
                break;
            }
        }
        cout << "Informe o CPF do Aluno" << endl;
        cin >> cpf;
        cout << "Informe o Telefone do Aluno" << endl;
        cin >> tel;
        cout << "Informe a Matricula do Aluno" << endl;
        cin >> mat;
        system("@cls||clear");
            u[cont_usu].Setnome(nome);
            u[cont_usu].Setcpf(cpf);
            u[cont_usu].Settelefone(tel);
            u[cont_usu].Setmatricula(mat);
            cont_usu++;
       }

    if(op2 == 2){//editar aluno
        cout << "Informe a Matricula do aluno que deseja editar" << endl;
        cin >> busca;
        for(int i=0;i<50;i++){
            if(busca == u[i].Getmatricula()){
                cout << "Informe o Nome do Aluno" << endl;
                while(getline(cin, nome)){
                if(nome != ""){
                break;
                }
            }
                cout << "Informe o CPF do Aluno" << endl;
                cin >> cpf;
                cout << "Informe o Telefone do Aluno" << endl;
                cin >> tel;
                system("@cls||clear");
                u[i].Setnome(nome);
                u[i].Setcpf(cpf);
                u[i].Settelefone(tel);
            }

        }
    }
    break;

    case 2://cadastrar ou editar livro
        cout << "Deseja Cadastrar ou Editar o Livro" << endl;
    cout << "1 - Cadastrar" << endl;
    cout << "2 - Editar" << endl;
    cin >> op2;
        if(op2 == 1){//cadastrar livro
        cout << "Informe o Codigo do Livro" << endl;
        cin >> cod_livro;
        cout << "Informe o Titulo do Livro" << endl;
        while(getline(cin, titulo)){
            if(titulo != ""){
                break;
            }
        }
        cout << "Informe o Autor do Livro" << endl;
        while(getline(cin, aut)){
            if(aut != ""){
                break;
            }
        }
        cout << "Informe o Ano de Lancamento do Livro" << endl;
        cin >> ano_lan;
        cout << "Informe a Edicao do Livro" << endl;
        cin >> edi;
        cout << "Informe a Editora do Livro" << endl;
        cin >> edit;
        cout << "Informe o ISBN do Livro" << endl;
        cin >> isbn;
        system("@cls||clear");
        l[cont_liv].Setcodigo(cod_livro);
        l[cont_liv].Settitulo(titulo);
        l[cont_liv].Setautor(aut);
        l[cont_liv].Setano_lancamento(ano_lan);
        l[cont_liv].Setedicao(edi);
        l[cont_liv].Seteditora(edit);
        l[cont_liv].SetISBN(isbn);
        cont_liv++;
        }

        if(op2 == 2){//editar aluno
        cout << "Informe o Codigo do Livro que deseja Editar" << endl;
        cin >> busca_livro;
        for(int i=0;i<50;i++){
            if(busca_livro == l[i].Getcodigo()){
                cout << "Informe o novo Titulo do Livro" << endl;
                while(getline(cin, titulo)){
                if(titulo != ""){
                break;
                }
            }
                cout << "Informe o novo Autor do Livro" << endl;
                while(getline(cin, aut)){
                if(aut != ""){
                break;
                }
            }
                cout << "Informe o novo Ano de Lancamento do Livro" << endl;
                cin >> ano_lan;
                 cout << "Informe o nova Edicao do Livro" << endl;
                cin >> edi;
                 cout << "Informe o nova Editora do Livro" << endl;
                cin >> edit;
                 cout << "Informe o novo ISBN do Livro" << endl;
                cin >> isbn;
                system("@cls||clear");
                l[i].Settitulo(titulo);
                l[i].Setautor(aut);
                l[i].Setano_lancamento(ano_lan);
                l[i].Setedicao(edi);
                l[i].Seteditora(edit);
                l[i].SetISBN(isbn);
            }

        }
    }
    break;

    case 3:
         cout << "Informe a Matricula do aluno que deseja procurar" << endl;
            cin >> busca;
            cont_busca = 0;
            for(int i=0;i<50;i++){
            if(busca == u[i].Getmatricula()){
                cout << "----------------------------" << endl;
                cout << "Nome: " << u[i].Getnome() << endl;
                cout << "CPF: " << u[i].Getcpf() << endl;
                cout << "Telefone: " << u[i].Gettelefone() << endl;
                cout << "Matricula: " << u[i].Getmatricula() << endl;
                cont_busca = 1;
            }
        }
            if (cont_busca != 1){
                cout << "Aluno nao encontrado..." << endl;
            }
    break;

     case 4:
         cout << "Informe o Codigo do Livro que deseja procurar" << endl;
            cin >> busca_livro;
            cont_busca = 0;
            for(int i=0;i<50;i++){
            if(busca_livro == l[i].Getcodigo()){
                cout << "----------------------------" << endl;
                cout << "Codigo: " << l[i].Getcodigo() << endl;
                cout << "Titulo: " << l[i].Gettitulo() << endl;
                cout << "Autor: " << l[i].Getautor() << endl;
                cout << "Ano de Lancamento: " << l[i].Getano_lancamento() << endl;
                cout << "Edicao: " << l[i].Getedicao() << endl;
                cout << "Editora: " << l[i].Geteditora() << endl;
                cout << "ISBN: " << l[i].GetISBN() << endl;
                cont_busca = 1;
            }
        }
        if (cont_busca != 1){
                cout << "Livro nao encontrado..." << endl;
        }
break;
     case 5:
                do{

                cout << "Informe o Codigo do livro que deseja emprestar" << endl;
                cin >> busca_livro;
                cont_busca = 0;


                    for(int i=0;i<50;i++){
                    if(busca_livro == l[i].Getcodigo()){
                        e[cont_emp].Setlivro(l[i]);
                        l[i].Setstatus(1);
                        cont_busca = 1;
                    }
                }
                     if (cont_busca != 1){
                    cout << "Livro nao encontrado..." << endl;
                        break;
                    }

                        cout << "Informe a matricula do aluno" << endl;
                        cin >> mat;
                        cont_busca = 0;

                        for(int i=0;i<50;i++){
                        if(mat == u[i].Getmatricula()){
                        e[cont_emp].Setaluno(u[i]);
                        cont_busca = 1;

                    }
                }
                    if (cont_busca != 1){
                        cout << "Aluno nao encontrado..." << endl;
                        break;
                        }


                        cout << "Informe a data do Emprestimo" << endl;
                        cout << "Informe o dia" << endl;
                        cin >> dia;
                        cout << "Informe o mes" << endl;
                        cin >> mes;
                        cout << "Informe o ano" << endl;
                        cin >> ano;

                        d.Setdia(dia);
                        d.Setmes(mes);
                        d.Setano(ano);


                        e[cont_emp].SetdataEmprestimo(d);
                        e[cont_emp].Setsituacao(1);
                        e[cont_emp].SetcodigoEmprestimo(cont_emp);

                        cout << "----------------------------" << endl;
                        cout << "Codigo do Emprestimo: " << e[cont_emp].GetcodigoEmprestimo() << endl;
                        cout << "Codigo do Livro emprestado: " << e[cont_emp].Getlivro().Getcodigo() << endl;
                        cout << "Matricula do Aluno: " << e[cont_emp].Getaluno().Getmatricula() << endl;
                        cout << "Data Emprestimo: " << e[cont_emp].GetdataEmprestimo().Getdia() << "/" << e[cont_emp].GetdataEmprestimo().Getmes() << "/" << e[cont_emp].GetdataEmprestimo().Getano() << endl;
                        cout << "----------------------------" << endl;

                        cont_emp++;

                         cout << "Deseja emprestar mais um livro S/N" << endl;
                        cin >> op_livro;
                        system("@cls||clear");


                  }while(op_livro != 'N');
        break;

     case 6:


                do{

                cout << "Informe a data atual" << endl;
                cout << "Informe o dia" << endl;
                cin >> dia;
                cout << "Informe o mes" << endl;
                cin >> mes;
                cout << "Informe o ano" << endl;
                cin >> ano;

                d.Setdia(dia);
                d.Setmes(mes);
                d.Setano(ano);

                cout << "Informe o livro que deseja devolver" << endl;
                cin >> busca_livro;
                cont_busca = 0;

                for(int i=0;i<50;i++){
                    if(busca_livro == e[i].Getlivro().Getcodigo()){
                        l[i].Setstatus(0);
                        cont_busca = 1;
                        cont_emp = i;

                        }
                }
                if (cont_busca != 1){
                    cout << "Livro nao encontrado..." << endl;
                        break;
                }
                e[cont_emp].Setsituacao(0);
                e[cont_emp].SetDataDevolucaoReal(d);

                cout << "----------------------------" << endl;
                cout << "Devolucao Concluida" << endl;
                cout << "----------------------------" << endl;
                cout << "Deseja devolver outro livro S/N" << endl;
                cin >> op_livro;
                system("@cls||clear");

                }while(op_livro != 'N');




        break;

     case 7:
            cout << "Informe qual tipo de relatorio deseja" << endl;
            cout << "1 - Listar todos os alunos" << endl;
            cout << "2 - Listar todos os livros" << endl;
            cout << "3 - Relatorio de livros emprestados" << endl;
            cin >> op2;
            system("@cls||clear");
            if(op2 == 1){
            for(int i=0;i<50;i++){
            if(u[i].Getmatricula() != 0){
                cout << "----------------------------" << endl;
                cout << "Nome: " << u[i].Getnome() << endl;
                cout << "CPF: " << u[i].Getcpf() << endl;
                cout << "Telefone: " << u[i].Gettelefone() << endl;
                cout << "Matricula: " << u[i].Getmatricula() << endl;


                        }
                    }
                }

            if(op2 == 2){
            for(int i=0;i<50;i++){
                if(l[i].Getcodigo() != 0){
                cout << "----------------------------" << endl;
                cout << "Codigo: " << l[i].Getcodigo() << endl;
                cout << "Titulo: " << l[i].Gettitulo() << endl;
                cout << "Autor: " << l[i].Getautor() << endl;
                cout << "Ano de Lancamento: " << l[i].Getano_lancamento() << endl;
                cout << "Edicao: " << l[i].Getedicao() << endl;

                    }
                }
            }

            if(op2 == 3){
                for(int i=0;i<100;i++){
                if(e[i].GetcodigoEmprestimo() == i && e[i].Getlivro().Getcodigo() != 0){
                cout << "----------------------------" << endl;
                cout << "Codigo: " << e[i].Getlivro().Getcodigo() << endl;
                cout << "Titulo do Livro: " << e[i].Getlivro().Gettitulo() << endl;
                cout << "Matricula do Aluno: " << e[i].Getaluno().Getmatricula() << endl;
                cout << "Nome do Aluno: " << e[i].Getaluno().Getnome() << endl;
                cout << "Data Emprestimo: " << e[i].GetdataEmprestimo().Getdia() << "/" << e[i].GetdataEmprestimo().Getmes() << "/" << e[i].GetdataEmprestimo().Getano() << endl;
                cout << "Data Devolucao: " << e[i].GetdataDevolucaoReal().Getdia() << "/" << e[i].GetdataDevolucaoReal().Getmes() << "/" << e[i].GetdataDevolucaoReal().Getano() << endl;
                if(e[i].Getsituacao() == 1){
                cout << "Status do Emprestimo: Pendente..." << endl;
                }else{
                cout << "Status do Emprestimo: Concluido!" << endl;
                }
                }

                }
            }
         break;


    }
}while(op != 8);
    return 0;

}
