#include <iostream>
#include <cstring>

using namespace std;

int main(){

int x;
char s1[20];
char s2[20];

 cout << "Insira uma palavra: " << endl;
    cin >> s1;

 cout << "Insira outra palavra: " << endl;
    cin >> s2;

x = strcmp(s1, s2);

if(x > 0){
cout << "A palavra " << s2 << " vem primeiro no alfabeto" << endl;
}else{
cout << "A palavra " << s1 << " vem primeiro no alfabeto" << endl;

}
}
