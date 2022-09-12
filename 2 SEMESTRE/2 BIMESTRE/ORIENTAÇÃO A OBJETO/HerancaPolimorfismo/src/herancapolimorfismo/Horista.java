package herancapolimorfismo;

import java.time.LocalDate;


public class Horista extends Funcionario{
    
    protected String CTPS;
    protected float valorHora;
    
    public Horista(String n, String c, LocalDate d, Endereco e, String cg, LocalDate da){
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

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularSalario(float qtdHoras){
    float s = qtdHoras * valorHora;
    
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
    public float calcularFGTS(float qtdHoras){
        float s = qtdHoras * valorHora;
        float fgts = s * 0.08f;
        return fgts;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Horista - " + "CTPS:" + CTPS + ", Valor da Hora:" + valorHora;
    }
    
    
}
