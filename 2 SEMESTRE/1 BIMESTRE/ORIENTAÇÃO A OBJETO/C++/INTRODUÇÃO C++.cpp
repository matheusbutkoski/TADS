#include <string>
#include <iostream>

using namespace std;

int main(){

    setlocale(LC_ALL, "Portuguese_brazil");
string nome;
string sobrenome;

cout << "Informe seu nome: " << endl;
cin >> nome;

cout << endl << "Ola " << nome << endl;
return 0;

}