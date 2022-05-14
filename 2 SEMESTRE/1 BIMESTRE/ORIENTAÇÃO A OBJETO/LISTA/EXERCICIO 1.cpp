#include <string>
#include <iostream>

using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese_brazil");
    string nome;

    cout << "Insira seu nome: " << endl;
    cin >> nome;

    for(int i = nome.size()-1;i>=0;i--){
        cout << nome[i];
    }
    return 0;
}
