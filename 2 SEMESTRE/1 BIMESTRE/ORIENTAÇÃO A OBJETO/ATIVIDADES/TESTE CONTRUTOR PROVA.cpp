#include <string>
#include <iostream>

using namespace std;

class Quadrado{

public:

Quadrado(int l1, int l2){
    inserirLados(l1,l2);
    cout << "Area do quadrado: " << areaQuadrado() << endl;
}

Quadrado(int l1, int l2, int l3, int l4){
    inserirLados(l1,l2);
    z = l3;
    i = l4;
    cout << "Perimetro do Quadrado: " << perimetroQuadrado() << endl;
}
void inserirLados(int l1, int l2){

x = l1;
y = l2;
}

int areaQuadrado(void){
    return x*y;
}

int perimetroQuadrado(void){
    return x+y+z+i;
}

private:

    int x,y,z,i;
};

int main(){

int l1, l2, l3, l4, op;

cout << "Informe dois lados do quadrado" << endl;
cin >> l1;
cin >> l2;

l3 = l1;
l4 = l2;

cout << "Informe a opcao que deseja" << endl;
cout << "1 - Area do Quadrado" << endl;
cout << "2 - Perimetro do Quadrado" << endl;
cin >> op;

if(op == 1){
    Quadrado q1(l1,l2);
}

if(op == 2){
    Quadrado q1(l1,l2,l3,l4);
}


}
