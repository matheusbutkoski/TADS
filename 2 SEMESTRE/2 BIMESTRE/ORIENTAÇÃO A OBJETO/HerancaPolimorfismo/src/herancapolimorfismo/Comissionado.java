
package herancapolimorfismo;

import java.time.LocalDate;


public class Comissionado extends Funcionario{
    protected String CTPS;
    protected int cargaHoraria;
    protected float salarioBase;
    protected float porcentagemComissao;
    
    public Comissionado(String n, String c, LocalDate d, Endereco e, String cg, LocalDate da){
        super.nome = n;
        super.cpf = c;
        super.endereco = e;
        super.dataNasc = d;
        super.cargo = cg;
        super.dataAdmissao = da;
 
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(float porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao / 100;
    }

    @Override
    public float calcularSalario(float totalVendas){
    
    float s = salarioBase +(totalVendas * porcentagemComissao);
    
    if(s < 1212){
        s = s - (s*0.075f);
    } else if(s >= 1212 && s <= 2427.35f){
        s = s - (s*0.09f);
    } else if(s >= 2427.36 && s <= 3614.03f){
        s = s - (s*0.12f);
    } else if(s >= 3641.04 && s<= 7087.22f){
        s = s - (s*0.14f);
    }    
    return s;
} 
    @Override
    public float calcularFGTS(float totalVendas){
        float s = salarioBase +(totalVendas * porcentagemComissao);
        float fgts = s * 0.08f;
        return fgts;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Comissionado - " + "CTPS: " + CTPS + ", Carga Horaria: " + cargaHoraria + ", Salario Base: " + salarioBase + ", Porcentagem Comissao: " + porcentagemComissao*100+"%";
    }
           
    
    
}
