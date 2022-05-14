#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){
int op;

struct data{

    int dia, mes, ano;
};

struct info{
    char nome[30];
    char altura[10];
    struct data D;
}pessoa[10];

printf("Informe uma opcao\n");
printf("1-Procurar por um nome\n");
printf("2-Listar Todos os Nomes e Alturas\n");
printf("3-Listar os nomes das pessoas nascidas antes de uma data\n");
scanf("%i", &op);

if(op == 1){

}
if(op == 2){

}

if(op == 3){

}


}
void CriaData(data &D){
srand(time(NULL));

for(int i=0; i<10;i++){
 pessoa[i].D.mes = 1 + (rand() % 12);
 pessoa[i].D.ano = 1950 + (rand() % 49);
 pessoa[i].D.dia = 1 + (rand() % 30);
}

}

int InserirPes(pessoa.nome){

int contPessoa=0

for(i=0;i<10;i++){
printf("Nome:\n");
fflush(stdin);
gets(pessoa[i].nome);

printf("Altura:\n");
fflush(stdin);
gets(pessoa[i].altura);
contPessoa++

}
}
}

int ListarNome(){
for(int i=0;i<contPessoa;i++){

printf("Nome: %s\n", pessoa[i].nome);
printf("Altura: %s\n", pessoa[i].altura);
printf("Data de Nascimento: %i/%i/%i\n", pessoa[i].D.dia, pessoa[i].D.mes, pessoa[i].D.ano);
printf("----------------\n");
}
}

int ListarData(){

int d, m, a;

printf("Informe uma data valida\n");
scanf("%i", &d);
scanf("%i", &m);
scanf("%i", &a);

for(i=;i<contPessoa;i++){
if(d <= pessoa[i].D.dia && m <= pessoa[i].D.mes && a <= pessoa[i].D.mes){
printf("Nome: %s\n", pessoa[i].nome);
printf("Altura: %s\n", pessoa[i].altura);
printf("Data de Nascimento: %i/%i/%i\n", pessoa[i].D.dia, pessoa[i].D.mes, pessoa[i].D.ano);
printf("----------------\n");
}
}
}



