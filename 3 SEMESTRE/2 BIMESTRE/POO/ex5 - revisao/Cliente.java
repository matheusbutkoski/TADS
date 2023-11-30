public class Cliente {
    public static void main(String[] args) {   
        
        ContaCorrente cc = new ContaCorrente();

        cc.depositar(1000, cc);
        cc.sacar(1250, cc);

    }
}
