package modelo;

public class Cliente extends Pessoa implements Entidade {

    @Override
    public void exibirInformacoes() {
      
        System.out.print(nome + " CPF: " + cpf );
        endereco.exibirInformacoes();
    }


   
}
