package modelo;


public abstract class Contrato {
    protected int id;
    protected Vendedor funcionario;
    protected Pessoa cliente;
    protected Imovel imovel;
    protected double valor;

    public Contrato() {
    }

    
    public Contrato(int id, Vendedor funcionario, Pessoa cliente, Imovel imovel, double valor) {
        this.id = id;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.imovel = imovel;
        this.valor = valor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendedor getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Vendedor funcionario) {
        this.funcionario = funcionario;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
