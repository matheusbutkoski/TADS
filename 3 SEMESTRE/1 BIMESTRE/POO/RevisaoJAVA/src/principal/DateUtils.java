package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class DateUtils {
    
    private static Calendar cal = Calendar.getInstance();
    private static SimpleDateFormat dateFormat 
            = new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date createDate(int dia, int mes, int ano){
        //cal.set(ano, mes, dia, 0 ,0);
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, --mes);
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        
        return cal.getTime();  
    }
    
    public static LocalDate createLocalDate(int dia, int mes, int ano){
        return LocalDate.of(ano, mes, dia);
    }
    
    public static Date obterDataAtualSistema(){
        return new Date();
    }
    
    public static LocalDate obterLocalDateAtualSistema(){
        return LocalDate.now();
    }
      
    public static Date parseDate(String data){
        try {
            return dateFormat.parse(data);
        } catch (ParseException e) {
            System.out.println("Falha ao converter a data: "+data);
            return null;
        }
        
    }
    
    public static LocalDate parseLocalDate(String data){
        return LocalDate.parse(data); // formato string ano-mes-dia
    }
    
    public static int getAnoDate(Date data){
        cal.setTime(data);
        return cal.get(Calendar.YEAR);
    }
    
    public static int getMesDate(Date data){
        cal.setTime(data);
        return cal.get(Calendar.MONTH);
    }
    
    public static int getDiaDate(Date data){
        cal.setTime(data);
        return cal.get(Calendar.DAY_OF_MONTH);
    }
    
    public static int getDiaDaSemanaDate(Date data){
        cal.setTime(data);
        return cal.get(Calendar.DAY_OF_WEEK);
    }
    
    public static int getHoraDate(Date data){
        cal.setTime(data);
        return cal.get(Calendar.HOUR_OF_DAY);
    }
    
    public static int getMinutosDate(Date data){
        cal.setTime(data);
        return cal.get(Calendar.MINUTE);
    }
    
    public static int getQuantidadeDiasMes(Date data){
        cal.setTime(data);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
