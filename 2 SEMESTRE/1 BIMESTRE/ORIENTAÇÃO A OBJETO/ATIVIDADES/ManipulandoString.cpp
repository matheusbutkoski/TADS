#include <iostream>
#include <string>
#include<algorithm>
#include<locale.h>
using namespace std;


// Função que retorna a string invertida
string inverterString(string str)
{
  string strInverter = "";
  for (int i=str.length()-1; i>=0; i--){
    strInverter += str[i];
  }
  return strInverter;
}

// Função que retorna a string em letra MAIÚSCULA
string upperString(string str)
{
  string strUPPER = "";
  for (int i=0; i< str.length(); i++){
    strUPPER += ::toupper(str[i]);
  }
  return strUPPER;
}


int main() {
    setlocale(LC_ALL,"");
    string str = "Hello world!";

    reverse(str.begin(), str.end());
    transform(str.begin(), str.end(),str.begin(), ::toupper);
    cout << str<<endl;

    string str2 = "Programação Orientada a Objetos!";
    str2 =inverterString(str2);
    str2 = upperString(str2);
    cout<<endl << str2<<endl;

    string minhaString= "String em C++ é Fácil";
    cout<<endl << minhaString<<endl;
    cout<<endl << "Tamanho da string é: " << minhaString.size() <<endl;

    cout<<endl <<"A posição da palavra 'Fácil' é: " << minhaString.find("Fácil") <<endl;

    cout<<endl << "Subtring: " << minhaString.substr(10,3)<<endl;

    cout<<endl << "Substituir a palavra 'Fácil':  " << minhaString.replace(16, 6, "Legal")<<endl;

    cout<<endl << "Inserir texto em determinada posição:  "<< minhaString.insert(14, "muito ")<<endl;

    cout<<endl << "Apagar a palavra 'String':  " << minhaString.erase(0,6)<<endl;
    return 0;
}
