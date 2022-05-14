#include "Data.h"

Data::Data()
{
    dia = 1;
    mes = 1;
    ano = 1900;
}

Data::Data(int d, int m, int a){

    dia = d;
    mes = m;
    ano = a;
}

Data::~Data()
{
    //dtor
}


int Data::Getdia(){
    return dia;
}

void Data::Setdia(int val){
    dia = val;
}

int Data::Getmes(){
    return mes;
}

void Data::Setmes(int val){
     mes = val;
}

int Data::Getano(){
    return ano;
}

void Data::Setano(int val){
     ano = val;
}
