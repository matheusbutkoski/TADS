#include <string>
#include <iostream>

using namespace std;

int main(){

int contMai=0, contMin=0;

 setlocale(LC_ALL, "Portuguese_brazil");
    string palavra;

    cout << "Insira uma palavra: " << endl;
    cin >> palavra;
     for(int i=0; i<palavra.length();i++){


        if(palavra[i] >= 97 && palavra[i] <= 122){
            contMin++;
        }else{
            contMai++;
        }

    }

    cout << "Numero de Minusculas: " << contMin << endl;
    cout << "Numero de Maiusculas: " << contMai << endl;

}
