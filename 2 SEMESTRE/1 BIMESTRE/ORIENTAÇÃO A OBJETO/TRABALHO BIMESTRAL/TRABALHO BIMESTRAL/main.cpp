#include <iostream>
#include <string>
#include "Usuario.h"
#include "Emprestimo.h"
#include "Livro.h"

using namespace std;

int main(){

int op, op2;
string nome, cpf, tel, mat;

    cout << "ESCOLHA UMA OPCAO" << endl;
    cout << "1 - CADASTRAR E EDITAR ALUNO" << endl;
    cout << "2 - CADASTRAR E EDITAR LIVRO" << endl;
    cout << "3 - PESQUISAR ALUNO" << endl;
    cout << "4 - PESQUISAR LIVRO" << endl;
    cout << "5 - REALIZAR EMPRESTIMO" << endl;
    cout << "6 - REALIZAR DEVOLUCAO" << endl;
    cout << "7 - GERAR RELATORIO" << endl;
    cin >> op;

    switch(op){

case 1:
    cout << "Deseja Cadastrar ou Editar Aluno" << endl;
    cout << "1 - Cadastrar" << endl;
    cout << "2 - Editar" << endl;
    cin >> op2;
        switch (op2){

    case 1:
        cout << "Informe o Nome do Aluno" << endl;
        cin >> nome;
        cout << "Informe o CPF do Aluno" << endl;
        cin >> cpf;
        cout << "Informe o Telefone do Aluno" << endl;
        cin >> tel;
        cout << "Informe a Matricula do Aluno" << endl;
        cin >> mat;

        u.setNome(nome);

    break;
    case 2:
    break;
        }
    break;
    }
    return 0;
}
