
package revisaostring;

import java.text.NumberFormat;
import java.util.Scanner;

public class StringUtils {

 private static Scanner leitor = new Scanner(System.in);

public static int qtdCaracteres(String s){
    return s.length();
}
    
public static String stringMaiusculo(String s){
    return s.toUpperCase();    
}

public static String stringMinusculo(String s){
    return s.toLowerCase();
}

public static int qtdVogais(String s){
    int cont = 0;
    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){                       
            cont++;
        }
    }
    return cont;
}

public static String substituirCaractere(String s, String c1, String c2){
    return s.replace(c1, c2);    
}

public static boolean verificaSubstring(String s, String s2){
    return s.contains(s2);
}

public static boolean verificarLetras(String s){
    String text = s.toLowerCase();
    char caracteres[] = text.toCharArray();
    for (int i = 0; i < caracteres.length; i++) {
        if (caracteres[i] >= 97 || caracteres[i] > 122){
            return false;
        }
    }
    return true;
}

public static boolean verificarNumeros(String s){
    String text = s.toLowerCase();
    char caracteres[] = text.toCharArray();
    for (int i = 0; i < caracteres.length; i++) {
        if (caracteres[i] >= 48 && caracteres[i] < 57){
            return false;
        }
    }
    return true;
}

public static boolean verificarPalindromo(String s){
    String s2 = new StringBuffer(s).reverse().toString();
    return s.equalsIgnoreCase(s2);   
}

public static String retirarEspacoes(String s){
    return s = s.trim();  
}

public static String formatarValor (float v){
    NumberFormat real = NumberFormat.getCurrencyInstance();
    return real.format(v);
    
}

}
