#include <iostream>
#include <string>
#include <cstring>

using namespace std;
int main(){

int i, op=0, len, j, x, cont=0, pos, tam;
string s1;
string s2;
string subs;
char cs1[20];
char cs2[20];
char y, z;

for(j=1; j!=0; j++){
cout << "----------Escolha uma opcao-----------" << endl;
cout << "1 - Escrever uma string" << endl;
cout << "2 - Mostrar o tamanho da string" << endl;
cout << "3 - Comparar a string com uma nova" << endl;
cout << "4 - Concatenar a string com uma nova" << endl;
cout << "5 - Imprimir a string ao contrario" << endl;
cout << "6 - Contar quantas vezes um caractere aparece na string" << endl;
cout << "7 - Substituir um caractere da string" << endl;
cout << "8 - Verificar se uma nova string eh substring" << endl;
cout << "9 - Retornar uma substring" << endl;
cout << "10 - Sair" << endl;
cin >> op;


if(op == 1){

    cout << "Digite a string(max. 20 caracteres)" << endl;
    cin >> s1;
    cout << "--------------------------------------" << endl;
}


if(op == 2){
    cout << "--------------------------------------" << endl;
    cout << "O Tamanho da string eh de " << s1.size() << " letras" << endl;
    cout << "--------------------------------------" << endl;
}

if(op == 3){

    for(i=0;i<s1.size();i++){
        cs1[i] = s1[i];
    }
    cout << "Insira a string s2" << endl;
    cin >> cs2;

    x = strcmp(cs1, cs2);

    if(x < 0){
        cout << "--------------------------------------" << endl;
        cout << "O resultado da comparacao eh: " << x << endl;
        cout << "A string s1 tem menor valor que s2" << endl;
        cout << "--------------------------------------" << endl;
        }
    if(x == 0){
        cout << "--------------------------------------" << endl;
        cout << "O resultado da comparacao eh: " << x << endl;
        cout << "A string s1 tem valor igual s2" << endl;
        cout << "--------------------------------------" << endl;
        }
    if(x > 0){
        cout << "--------------------------------------" << endl;
        cout << "O resultado da comparacao eh: " << x << endl;
        cout << "A string s1 tem maior valor que s2" << endl;
        cout << "--------------------------------------" << endl;
        }
    }
if (op == 4){
       for(i=0;i<s1.size();i++){
        cs1[i] = s1[i];
    }

    cout << "Insira a string s2" << endl;
    cin >> cs2;
    cout << "A concatenacao resultou: " << strcat(cs1, cs2) << endl;


}

if (op == 5){
    cout << "--------------------------------------" << endl;
    for(int i = s1.size()-1;i>=0;i--){
        cout << s1[i];
        }
     cout << endl;
    cout << "--------------------------------------" << endl;
}

if (op == 6){
    cout << "Informe o caractere que deseja procurar na string" << endl;
    cin >> y;

    for(i=0;i<s1.size();i++){
        if(s1[i] == y){
            cont++;
            }
        }
    cout << "--------------------------------------" << endl;
    cout << "O caractere aparece " << cont << " vezes" << endl;
}

if(op == 7){
    cout << "Informe o caractere que deseja substituir" << endl;
    cin >> y;

    cout << "Informe o novo caractere" << endl;
    cin >> z;

        i = s1.find(y);
            s1[i] = z;


     cout << "--------------------------------------" << endl;
    cout << "Nova string " << s1 << endl;
}


if(op == 8){
    cont=0;
    cout << "Informe a substring a ser verificada" << endl;
    cin >> subs;

    for(i=0;i<s1.length();i++){
        for(j=0;j<subs.length();j++){
    if (s1[i] == subs[j]){
        cont++;
            }
        }
    }
   if(cont == subs.length()){
    cout << "--------------------------------------" << endl;
    cout << "Eh susbtring" << endl;

   }else{
    cout << "--------------------------------------" << endl;
    cout << "Nao eh substring" << endl;
   }
}

if(op == 9){
    cout << "Informe a posicao de comeco da substring" << endl;
    cin >> pos;
    cout << "Informe o tamanho da substring" << endl;
    cin >> tam;
    cout << endl << "Substring: " << s1.substr(pos, tam) << endl;
}
if(op == 10){
break;
}
}
}

