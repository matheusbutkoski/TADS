
package modelo;


public class Chacara extends ImovelRural {
    
     public Chacara(String m, Pessoa p, Endereco e, double l, double c, double v){
        super.matriculaImovel = m;
        super.proprietario = p;
        super.endereco = e;
        super.largura = l;
        super.comprimento = c;
        super.valor = v;
        
    }
    @Override
    public double calcularICMS(){
        return valor * 0.03;
    }

    @Override
    public int compareTo(Imovel o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
