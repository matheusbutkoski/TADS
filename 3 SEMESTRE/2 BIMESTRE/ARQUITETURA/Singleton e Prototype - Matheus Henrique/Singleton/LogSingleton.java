
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogSingleton { 
    

    private FileWriter arquivo = null;
    private PrintWriter writer = null;

    private static LogSingleton logSingleton;   

    private LogSingleton() {

        try {
            String path = System.getProperty("user.dir");
            System.out.println(path);
            String filePath = path + File.separator + "testelog_singleton.log";        
            System.out.println(filePath);    
            this.arquivo = new FileWriter(filePath);
            this.writer = new PrintWriter(arquivo);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static LogSingleton getInstance() {
        if (logSingleton == null ) {
            logSingleton = new LogSingleton();
        }
        return logSingleton;
    }     

    public void escreve_linha_arquivo(String linha) {
        try {
            this.writer.println(linha);         
            this.arquivo.flush();
        } catch (Exception e) {
            System.out.println(e.toString()); 
        }
             
    }
    

}