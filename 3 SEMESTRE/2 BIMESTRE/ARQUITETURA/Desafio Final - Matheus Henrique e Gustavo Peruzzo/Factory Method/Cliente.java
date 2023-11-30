import factory.LanceFactory;
import factory.LeilaoFactory;
import factory.LeilaoOnlineFactory;
import factory.OnlineFactory;
import factory.PresencialFactory;
import modelo.Leilao;

public class Cliente{
    
    public static void main(String[] args) {

        LeilaoFactory onlineLeilao = new LeilaoOnlineFactory();
        Leilao leilaoOnline = onlineLeilao.ordemLeilao(1);

        System.out.println("Lances: ");
        System.out.println("====================================================");
        LanceFactory lanceOnline1 = new OnlineFactory();
        lanceOnline1.ordemLances(1000, leilaoOnline);
        System.out.println("====================================================");
        LanceFactory lancePresencial1 = new PresencialFactory();
        lancePresencial1.ordemLances(1250, leilaoOnline);
        System.out.println("====================================================");
        LanceFactory lanceOnline2 = new OnlineFactory();
        lanceOnline2.ordemLances(1500, leilaoOnline);
        System.out.println("====================================================");

        
    
    }
}