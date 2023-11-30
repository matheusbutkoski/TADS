package builder.java.atividade_casa.builders;

import builder.java.atividade_casa.casas.TipoDeCasa;
import builder.java.atividade_casa.componentes.Parede;
import builder.java.atividade_casa.componentes.Teto;


public interface Builder {

    void setTipoDeCasa(TipoDeCasa tipoDaCasa);
    void setJanelas(int janela);
    void setPortas(int portas);
    void setParedes(Parede paredes);
    void setTeto(Teto teto);
    void setGaragem(int espacoGaragem);
    void setQuartos(int qtdQuartos);

}
