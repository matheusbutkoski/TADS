#include <iostream>
#include <stdlib.h>
#include <string>
#include <locale>

using namespace std;

int count = 0;

class Aluno{
private:
	string nome;
	int RA;
	int ano, mes, dia;
	char sexo;
	string cpf, curso;

public:
    Aluno(){

    }

    string getNome(){
        return nome;
    }

    void setNome(string n){
        nome = n;
    }

    string getCpf(){
        return cpf;
    }

    void setNCpf(string c){
        cpf = c;
    }

    string getCurso(){
        return curso;
    }

    void setCurso(string n){
        curso = n;
    }

    int getRA(){
        return RA;
    }

    void setRA(int r){
        RA = r;
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

    char getSexo(){
        return sexo;
    }

    void setSexo(char s){
        sexo = s;
    }

    int calcularIdade(int anoAtual, int mesAtual, int diaAtual){
        int diasDataNasc = ano * 365 + mes * 30 + dia;
        int diasDataAtual = anoAtual * 365 + mesAtual * 30 + diaAtual;
        int idade = diasDataAtual - diasDataNasc;
        idade = idade/365;
        return idade;
    }

}alunos[200];

void cadastrarAluno(){
    //fflush(stdin); //limpa buffer do teclado
	string nome;
	int ra;
	cout << "Nome do Aluno: ";
	//getline(cin, nome);
	cin >> nome;
	alunos[count].setNome(nome);

	cout << endl << "RA:";
	cin >> ra;
	alunos[count].setRA(ra);
	count++;
}

int pesquisarAluno(){
	int busca_RA, i;
	system("@cls||clear");

	cout << "Informe o RA do aluno: ";
	cin >> busca_RA;


	for(i = 0; i< count; i++){
		if(alunos[i].getRA() == busca_RA){
			cout << "Nome: " << alunos[i].getNome() << endl;
			cout << "RA: " << alunos[i].getRA() << endl;
			system("pause");
			return 0;
		}
	}
	cout << "Aluno não encontrado!\n";
	system("pause");
}

void listarAlunos(){
    system("@cls||clear");
	int i;

	cout << "\n\nExibindo lista de Alunos \n";
	for(i = 0; i < count; i++){
        cout << endl << "RA: " << alunos[i].getRA() ;
		cout << " - Aluno: " << alunos[i].getNome() ;

	}
    cout << "\n\n------------------------------------------------------ \n";

}

void editarAluno(){
    int posicao=-1;
    int i, busca_RA;

    system("@cls||clear");
	cout << "Insira o RA desejado: ";
	cin >> busca_RA;

	for(i = 0; i< count; i++){
		if(alunos[i].getRA() == busca_RA){
			cout << "\n\n--- Aluno encontrado ---\n\n";
			cout << "Nome: " << alunos[i].getNome() << endl;
			cout << "RA: " << alunos[i].getRA() << endl;
			posicao = i;

			cout << endl << "--- Informe os dados ---";
			//fflush(stdin); //limpa buffer do teclado
			string n;
            cout << "Nome do Aluno: ";
            //getline(cin, n);
            cin >> n;
            alunos[count].setNome(n);

            int r;
            cout << endl << "RA: ";
            cin >> r;
            alunos[posicao].setRA(r);
            cout << "\n\nCadastro Editado!\n\n";
		}
	}
	if(posicao == -1){
		cout << "\n\nAluno não encontrado!\n\n";
	}

}

int main(){
	int op;

	do{
        //fflush(stdin);
		cout <<"\n*** MENU PRINCIPAL ***\n\n";
        cout <<"(1) - Cadastrar Aluno\n";
        cout <<"(2) - Pesquisar Aluno\n";
        cout <<"(3) - Listar Aluno\n";
        cout <<"(4) - Editar Aluno\n";
        cout <<"(0) - Sair\n\n";
		cin >> op;

		cout <<"op: "<< op;
		//system("@cls||clear");

		switch(op){
			case 1:
				cadastrarAluno();
				break;
			case 2:
				pesquisarAluno();
				break;
			case 3:
				listarAlunos();
			    break;
			case 4:
			    editarAluno();
			    break;
			default:
				break;
		}


	}while(op!=0);

	return 0;
}
