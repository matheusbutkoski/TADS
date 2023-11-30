package modelo;

import java.time.LocalDate;

import util.DateUtils;

public class Emprestimo implements Entidade{
    
    protected Integer id;
    protected Livro livro;
    protected Vendedor vendedor;
    protected Cliente cliente;
    protected LocalDate dataEmprestimo;
    protected LocalDate dataDevolucao;
    protected int prazoDias;
    protected String status;

    public Emprestimo(){
        status = "Pendente";
        vendedor = new Vendedor();
        cliente = new Cliente();
        livro = new Livro();
    }

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println("Id: "+ id +" Livro: " + livro.getTitulo() + " - " + cliente.getNome() + "\n" + "Prazo Devolucao: " + prazoDias + " Data Emprestimo: " + DateUtils.formatarDataBR(dataEmprestimo)+"\n"+"Status: " + status);
        
    }
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public int getPrazoDias() {
        return prazoDias;
    }
    public void setPrazoDias(int prazoDias) {
        this.prazoDias = prazoDias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
