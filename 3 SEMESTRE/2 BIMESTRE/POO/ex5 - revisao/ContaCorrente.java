public class ContaCorrente{
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor, ContaCorrente conta){
        try{
                             
            conta.verificarSaldo(valor, saldo);
            setSaldo(saldo - valor);
            System.out.println("Saque Efetuado!");
            System.out.println("Saldo: " + saldo);
        }catch(ContaException ce){
            System.out.println(ce.getMessage());
        }
    }

    public void depositar(double valor, ContaCorrente conta){
        this.setSaldo(saldo + valor);
    }

    public double verificarSaldo(double valor, double saldo) throws ContaException{
        if(saldo < valor){
            throw new ContaException();
        }
        return saldo - valor;
    }

}