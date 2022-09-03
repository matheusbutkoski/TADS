package revisaodata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import java.util.Date;


public class DateUtils {
    
    private static Calendar cal = Calendar.getInstance();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date createDate(int dia, int mes, int ano){
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, mes);
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
    
    public static LocalDate addAno(LocalDate data, int ano) {
        return data.plusYears(ano);
    }

    public static LocalDate addMes(LocalDate data, int mes) {
        return data.plusMonths(mes);
    }

    public static LocalDate addDia(LocalDate data, int dia) {
        return data.plusDays(dia);
    }

    public static LocalTime addHora(LocalTime data, int hora) {
        return data.plusHours(hora);
    }

    public static LocalTime addMinutos(LocalTime data, int minutos) {
        return data.plusMinutes(minutos);
    }
    
    
    
    public static LocalDate tirarAno(LocalDate data, int ano) {
        return data.minusYears(ano);
    }

    public static LocalDate tirarMes(LocalDate data, int mes) {
        return data.minusMonths(mes);
    }

    public static LocalDate tirarDia(LocalDate data, int dia) {
        return data.minusDays(dia);
    }

    public static LocalTime tirarHora(LocalTime data, int hora) {
        return data.minusHours(hora);
    }

    public static LocalTime tirarMinutos(LocalTime data, int minutos) {
        return data.minusMinutes(minutos);
    }


    
    public static long calcularDias(LocalDate data1, LocalDate data2){
        long dif = ChronoUnit.DAYS.between(data1, data2);
        return dif;
    }
    
    public static long calcularHoras(LocalDateTime data1, LocalDateTime data2){
        long dif = ChronoUnit.HOURS.between(data1, data2);
        return dif;
    }
    
    public static boolean bissexto(Date data){
        cal.setTime(data);
        int x = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        
        if(x > 365){
            return true;
        }else{
            return false;
        }
      }
    
    public static LocalDate segundaSextaFeira(LocalDate data){
        LocalDate d = data.with(firstDayOfMonth());
        int count = 0;
        while(count < 2){
            if(d.getDayOfWeek() == DayOfWeek.FRIDAY){
                count++;
            }
            d = d.plusDays(1);     
        }
        return d.minusDays(1);
    }
    
    
        public static LocalDate quintoDiaUtilMes(LocalDate data){
        LocalDate d= data.with(firstDayOfMonth());
        int count = 0; 
        while(count < 5){
            if( d.getDayOfWeek() != DayOfWeek.SATURDAY && d.getDayOfWeek() != DayOfWeek.SUNDAY ){
                count++;
            }
            d = d.plusDays(1);
        }    
        return d.minusDays(1);
    }
}
