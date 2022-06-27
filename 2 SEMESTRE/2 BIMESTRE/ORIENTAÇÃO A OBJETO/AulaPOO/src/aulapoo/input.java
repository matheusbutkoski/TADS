package aulapoo;

import java.util.Scanner;


public class input {
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static String nextLine(){
        return teclado.useDelimiter("\\n").next();
    }
}
