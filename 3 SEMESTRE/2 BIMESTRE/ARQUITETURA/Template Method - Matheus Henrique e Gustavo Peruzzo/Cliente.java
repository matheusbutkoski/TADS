import modelo.ImovelRural;
import modelo.ImovelUrbano;
import template_method.Imovel;

public class Cliente{
    public static void main(String[] args) {
        Imovel imovelRural = new ImovelRural(100000, 35);
        double ITR = imovelRural.calcularImposto();
        System.out.println("Valor do ITR do Imovel: "+ ITR);

        Imovel imovelUrbano = new ImovelUrbano(250000);
        double IPTU = imovelUrbano.calcularImposto();
        System.out.println("Valor do IPTU do Imovel: "+ IPTU);
        
}
}

/* CONTEXTO: É necessario calcular os impostos de dois tipos de imoveis: rurais e urbanos

 * PROBLEMA: Existem diferentes aliquotas para cada tipo de imovel, esse programa tornara mais facil o calculo dos impostos
 * 
 * SOLUÇÃO: Criamos uma classe abstrata de template e extendemos para as classes concretas. Com o auxilio do polimorfismo, criamos 
 * diferentes implementacoes para os métodos que serão chamados de acordo com o tipo de Objeto instanciado. 
 *
 */