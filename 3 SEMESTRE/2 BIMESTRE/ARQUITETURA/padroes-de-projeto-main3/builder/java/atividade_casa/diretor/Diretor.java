package builder.java.atividade_casa.diretor;

import builder.java.atividade_casa.casas.TipoDeCasa;
import builder.java.atividade_casa.componentes.Parede;
import builder.java.atividade_casa.componentes.Teto;
import builder.java.atividade_casa.builders.Builder;

public class Diretor {
 
        public void construirCasaPiscina(Builder builder) {
            builder.setTipoDeCasa(TipoDeCasa.Casa_Piscina);
            builder.setParedes(new Parede("Branco","Gesso"));
            builder.setPortas(5);
            builder.setJanelas(5);
            builder.setQuartos(3);
            builder.setTeto(new Teto("Gesso"));
            builder.setGaragem(2);
        }

        public void construirCasaEstatuas(Builder builder) {
            builder.setTipoDeCasa(TipoDeCasa.Casa_Estatuas);
            builder.setParedes(new Parede("Branco","Gesso"));
            builder.setPortas(5);
            builder.setJanelas(5);
            builder.setQuartos(3);
            builder.setTeto(new Teto("Gesso"));
            builder.setGaragem(2);
        }

        public void construirCasaJardim(Builder builder) {
            builder.setTipoDeCasa(TipoDeCasa.Casa_Jardim);
            builder.setParedes(new Parede("Branco","Gesso"));
            builder.setPortas(5);
            builder.setJanelas(5);
            builder.setQuartos(3);
            builder.setTeto(new Teto("Gesso"));
            builder.setGaragem(2);
        }

        public void construirCasaGaragem(Builder builder) {
            builder.setTipoDeCasa(TipoDeCasa.Casa_Garagem);
            builder.setParedes(new Parede("Branco","Gesso"));
            builder.setPortas(5);
            builder.setJanelas(5);
            builder.setQuartos(3);
            builder.setTeto(new Teto("Gesso"));
            builder.setGaragem(2);
        }
    
    }
        

