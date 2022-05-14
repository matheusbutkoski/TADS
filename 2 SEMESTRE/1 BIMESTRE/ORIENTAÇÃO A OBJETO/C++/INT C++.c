#include <string>
#include <iostream>

using namespace std;

int main(){

    setlocale(LC_ALL, "Portuguese_brazil");
string nome;
string sobrenome;

cout << "Informe seu nome: " << endl;
cin >> nome;

cout << "Informe seu sobrenome: " << endl;
cin >> sobrenome;

cout << endl << "Ola " << nome << "  "<< sobrenome << endl;
return 0;
}
