#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <windows.h>
/*             0     1    2     3   4      5      6      7         8  */
typedef enum{BLACK,BLUE,GREEN,CYAN,RED,MAGENTA,BROWN,LIGHTGRAY,DARKGRAY,   /* nome das cores */
LIGHTBLUE,LIGHTGREEN,LIGHTCYAN,LIGHTRED,LIGHTMAGENTA,YELLOW,WHITE} COLORS;
/*  9         10         11        12        13         14    15 */
static int __BACKGROUND = 1/*BLACK*/;/*pode ser o numero ou o nome da cor*/
static int __FOREGROUND = LIGHTGRAY;

int nh,consumo,np,cdc,maior,menor=500;
float vkw,tc,mc,cr,ccom,ci;/* colocando as variáveis aqui     */
/* antes da  , main , elas serão inicializadas com valor zero */
void textcolor(int letras , int fundo);
int main(){
	char cc;
	srand(time(NULL));
	textcolor(11,0);
	printf("O numero de habitantes da cidade ");
	textcolor(14,0);
	scanf("%d",&nh);
	textcolor(11,0);
	printf("O valor do kwh ");
	textcolor(14,0);
	scanf("%f",&vkw);
	while(np < nh){
		consumo=rand()%501;
		cdc=rand()%3+1;
	    np += 1;
	    tc += consumo;
		mc = tc/nh;
        if(cdc==1){
			cc='r';
			cr += consumo;
		}
		else
            if(cdc == 2){
		  	   cc='c';
		  	   ccom += consumo;
            }
            else
                if(cdc == 3){
		  	        cc='i';
		  	        ci += consumo;
                }
        if(consumo > maior)
		  	maior = consumo;
        if(consumo < menor)
            menor = consumo;
        textcolor(13,15);
		printf("\n  o consumo foi %3d o tipo foi %c  ",consumo,cc);
	}
	printf("\n");
	textcolor(12,15);
	printf("\n  o maior consumo foi de -----------------> %d  "  ,maior);
	printf("\n  o menor consumo foi de -----------------> %d  "  ,menor);
	printf("\n  o meu total de consumo foi de ----------> %.2f  ",   tc);
	printf("\n  minha media de consumo foi -------------> %.2f  ",   mc);
	printf("\n  o total de consumo das residencias sao -> %.2f  ",   cr);
	printf("\n  o total de consumo dos comercios   sao -> %.2f  ", ccom);
	printf("\n  o total de consumo das indistriais sao -> %.2f  ",   ci);
	printf("\n\n" );
	textcolor(10,12);
	system("pause");
	textcolor(14,0);
	return 0;
}
void textcolor(int letra, int fundo){/*para mudar a cor de fundo mude o background*/
    __FOREGROUND = letra;
    __BACKGROUND = fundo;
    SetConsoleTextAttribute (GetStdHandle (STD_OUTPUT_HANDLE),
    letra + (__BACKGROUND << 4));
}
