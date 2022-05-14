#include <string>
#include <iostream>

using namespace std;
int main(){
string frase;
string inversa;

 cout << "Insira uma frase: " << endl;
   getline(cin, frase);

 for (int i=0; i<frase.length(); i++){

     if(frase[i] >= 97 && frase[i] <= 122){
         inversa += ::toupper(frase[i]);
     }else{
         inversa += ::tolower(frase[i]);
     }

}
 cout << "" << inversa << endl;

}
