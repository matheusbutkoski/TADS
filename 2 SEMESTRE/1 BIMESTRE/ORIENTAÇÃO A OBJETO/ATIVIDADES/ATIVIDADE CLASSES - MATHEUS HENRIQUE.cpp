
#include <string>
#include <iostream>

using namespace std;

int count = 0;

class Aluno{

private:
    string nome;
    int ra;
    string cpf;
    char sexo;
    int ano, mes, dia;
    string curso;
    int idade;


public:
    Aluno(){
    }
    string getNome(){
    return nome;
    }
    void setNome(string n){
        nome = n;
    }

    int getRA(){
    return ra;
    }
    void setRA(int r){
        ra = r;
    }

    string getCPF(){
    return cpf;
    }
    void setCPF(string c){
        cpf = c;
    }

    char getSexo(){
        return sexo;
    }
    void setSexo(char s){
        sexo = s;
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

    string getCurso(){
        return curso;
    }
    void setCurso(string cs){
        curso = cs;
    }

    int getIdade(){
        return idade;
    }

    void setIdade(int id){
        idade = id;
    }


}alunos[200];

void cadastrarAluno(){
        system("@cls||clear");
        string nome;
        int ra;
        string cpf;
        char sexo;
        int ano, mes, dia;
        string curso;


        cout << "Informe o Nome do Aluno" << endl;
        cin >> nome;
        alunos[count].setNome(nome);

        cout << "Informe o RA do Aluno" << endl;
        cin >> ra;
        alunos[count].setRA(ra);

        cout << "Informe o CPF do Aluno" << endl;
        cin >> cpf;
        alunos[count].setCPF(cpf);

        cout << "Informe o sexo do Aluno M/F" << endl;
        cin >> sexo;
        alunos[count].setSexo(sexo);

        cout << "Informe o DIA de nascimento do Aluno" << endl;
        cin >> dia;
        alunos[count].setDia(dia);

        cout << "Informe o MES de nascimento do Aluno" << endl;
        cin >> mes;
        alunos[count].setMes(mes);

        cout << "Informe o ANO de nascimento do Aluno" << endl;
        cin >> ano;
        alunos[count].setAno(ano);

        cout << "Informe o curso do Aluno" << endl;
        cin >> curso;
        alunos[count].setCurso(curso);

        int anoAtual = 2022;
        int mesAtual = 04;
        int diaAtual = 06;

        int diasDataNasc = (alunos[count].getAno() * 365) + (alunos[count].getMes() * 30) + (alunos[count].getDia());
        int diasDataAtual = (anoAtual * 365) + (mesAtual * 30) + diaAtual;
        int id_aluno = (diasDataAtual - diasDataNasc)/365;

        alunos[count].setIdade(id_aluno);

        system("@cls||clear");

        cout << "Aluno Cadastrado!" << endl;
        cout << "-------------------" << endl;
        count++;


       }



int pesquisarAluno(){
    system("@cls||clear");
   int pesqRA, op;
   string pesqCPF;

   cout << "Deseja procurar o Aluno por:" << endl;
   cout << "1 - RA" << endl;
   cout << "2 - CPF" << endl;
   cin >> op;

    switch(op){
    case 1:
    system("@cls||clear");
   cout << "Informe o RA que deseja procurar" << endl;
    cin >> pesqRA;
    system("@cls||clear");
    for(int i=0;i<count;i++){
        if(pesqRA == alunos[i].getRA()){
        cout << "-------------------" << endl;
        cout << "Aluno Encontrado!" << endl;
        cout << "Nome: " << alunos[i].getNome() << endl;
        cout << "CPF: " << alunos[i].getRA() << endl;
        cout << "Sexo: " << alunos[i].getSexo() << endl;
        cout << "Data de Nascimento: " << alunos[i].getDia() << "/" << alunos[i].getMes() << "/" << alunos[i].getAno() << endl;
        cout << "Idade: " << alunos[i].getIdade() << endl;
        cout << "Curso: " << alunos[i].getCurso() << endl;
        cout << "-------------------" << endl;
        return 0;

        }else{
        cout << "Aluno n?o encontrado!\n";
        }
}
break;

     case 2:
   cout << "Informe o CPF que deseja procurar" << endl;
    cin >> pesqCPF;
    system("@cls||clear");
    for(int i=0;i<count;i++){
        if(pesqCPF == alunos[i].getCPF()){
        cout << "-------------------" << endl;
        cout << "Aluno Encontrado!" << endl;
        cout << "Nome: " << alunos[i].getNome() << endl;
        cout << "CPF: " << alunos[i].getCPF() << endl;
        cout << "Sexo: " << alunos[i].getSexo() << endl;
        cout << "Data de Nascimento: " << alunos[i].getDia() << "/" << alunos[i].getMes() << "/" << alunos[i].getAno() << endl;
        cout << "Idade: " << alunos[i].getIdade() << endl;
        cout << "Curso: " << alunos[i].getCurso() << endl;
        cout << "-------------------" << endl;
        return 0;

        }else{
        cout << "Aluno nao encontrado!\n";
        }
}
break;
}
}

void gerarRelatorio(){
    int opR, aux=0;
    string rCurso;
    int contAlunos = 0;
    float mediaIdade;
    string cursoAluno;


    system("@cls||clear");

    cout << "Informe qual tipo de relatorio deseja gerar" << endl;
    cout << "1 - Relatorio de todos os alunos" << endl;
    cout << "2 - Relatorio de alunos por curso " << endl;
    cout << "3 - Relatorio Quantitativo" << endl;
    cin >> opR;

    switch(opR){
    case 1:
        system("@cls||clear");
        cout << "-------------------" << endl;
        for(int i=0;i<count;i++){

        cout << "Nome: " << alunos[i].getNome() << endl;
        cout << "RA: " << alunos[i].getRA() << endl;
        cout << "CPF: " << alunos[i].getCPF() << endl;
        cout << "Sexo: " << alunos[i].getSexo() << endl;
        cout << "Idade: " << alunos[i].getIdade() << endl;
        cout << "-------------------" << endl;
    }
        break;
    case 2:
        system("@cls||clear");
        cout << "Informe o Curso que deseja procurar os alunos" << endl;
        cin >> rCurso;
        cout << "-------------------" << endl;
        for(int i=0;i<count;i++){
            if(alunos[i].getCurso() == rCurso){

        cout << "Nome: " << alunos[i].getNome() << endl;
        cout << "RA: " << alunos[i].getRA() << endl;
        cout << "CPF: " << alunos[i].getCPF() << endl;
        cout << "Sexo: " << alunos[i].getSexo() << endl;
        cout << "Idade: " << alunos[i].getIdade() << endl;
        cout << "-------------------" << endl;
            }
        }
        break;
    case 3:


        system("@cls||clear");
            cout << "-------------------" << endl;



           for(int i=0;i<count;i++){
            contAlunos=0;
            mediaIdade=0;

            cursoAluno = alunos[i].getCurso();
            for(int j=0;j<count;j++){
            if(cursoAluno == alunos[j].getCurso()){
            contAlunos++;
            mediaIdade = mediaIdade + alunos[j].getIdade();
}
            }
            }


        cout << "Curso: " << cursoAluno << endl;
        cout << "Numero de Alunos:" << contAlunos << endl;
        cout << "Media de Idade " << mediaIdade/contAlunos << endl;
        cout << "-------------------" << endl;


            }
}




void editarAluno(){
    system("@cls||clear");
    int edit, eRA, opEdit;
    string eNome, eCurso;
        cout << "Informe o RA do aluno que deseja editar" << endl;
        cin >> edit;
        system("@cls||clear");
         for(int i=0; i<100; i++){
            if(edit == alunos[i].getRA()){
                cout << "-------------------" << endl;
                cout << "Aluno Encontrado!" << endl;
                cout << "Nome: " << alunos[i].getNome() << endl;
                cout << "RA: " << alunos[i].getRA() << endl;
                cout << "Curso:" << alunos[i].getCurso() << endl;
                cout << "-------------------" << endl;

        cout << "Informe o dado que deseja editar no aluno" << endl;
        cout << "1 - Nome" << endl;
        cout << "2 - RA" << endl;
        cout << "3 - Curso" << endl;
        cin >> opEdit;

        system("@cls||clear");
        switch(opEdit){
        case 1:
           cout << "Digite o novo NOME" << endl;
        getline(cin, eNome);
        alunos[i].setNome(eNome);
        break;

        case 2:
        cout << "Digite o novo RA" << endl;
        cin >> eRA;
        alunos[i].setRA(eRA);

        break;

        case 3:
        cout << "Digite o novo Curso" << endl;
        cin >> eCurso;
        alunos[i].setCurso(eCurso);
        break;

            }
        }
    }
    cout << "Edicao Concluida!" << endl;
    cout << "-------------------" << endl;
}

int main(){

int i, j, esc, x=0;


do{

cout << "Escolha o que deseja fazer" << endl;
cout << "1 - Cadastrar Aluno" << endl;
cout << "2 - Editar registro de aluno" << endl;
cout << "3 - Pesquisar Aluno pelo RA" << endl;
cout << "4 - Gerar Relatorio" << endl;
cout << "0 - Sair" << endl;
cin >> esc;

switch(esc){
			case 1:
				cadastrarAluno();
				break;
			case 2:
				editarAluno();
				break;
			case 3:
				pesquisarAluno();
			    break;
			case 4:
			    gerarRelatorio();
			    break;
			default:
				break;
		}

}while(esc!=0);

}



