

public class Cliente {
 
    public static void main(String[] args) {
        
        LogSingleton logSingleton1 = LogSingleton.getInstance();
        System.out.println(logSingleton1.toString());
        logSingleton1.escreve_linha_arquivo("TesteLog1");

        LogSingleton logSingleton2 = LogSingleton.getInstance();
        System.out.println(logSingleton2.toString());
        logSingleton1.escreve_linha_arquivo("TesteLog2");

        LogSingleton logSingleton3 = LogSingleton.getInstance();
        System.out.println(logSingleton3.toString());
        logSingleton1.escreve_linha_arquivo("TesteLog3");

    }

}