package controle;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import modelo.Endereco;
import persistencia.DaoEndereco;
import util.Input;

/**
 *
 * @author andre.luchesi
 */
public class ControleEndereco {
    private DaoEndereco dao;

    public ControleEndereco() {
        dao = new DaoEndereco();
    }
    
    public void cadastrar(){
        Endereco end = new Endereco();
        setarDados(end);
        if(cadastroValido(end)){
            dao.saveOrUpdate(end);
        }
    }
    
    public void editar(Endereco end){
        setarDados(end);
        if(cadastroValido(end)){
            dao.saveOrUpdate(end);
        }
    }
    
    public void setarDados(Endereco end){
        System.out.println("informe a cidade: ");
        end.setCidade(Input.nextLine());
        System.out.println("informe o bairro: ");
        end.setBairro(Input.nextLine());
        System.out.println("informe a rua: ");
        end.setRua(Input.nextLine());
        System.out.println("informe o número: ");
        end.setNumero(Input.next());
    }
    
    public boolean cadastroValido(Endereco end){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Endereco>> violations = validator.validate(end);
        
        return !violations.isEmpty();
    }
    
    public Endereco carregarPorId(int id){
        return (Endereco) dao.findById(id);
    }
    
    public List<Endereco> carregarTodos(){
        return  dao.findAll().stream().map(e -> (Endereco) e).collect(Collectors.toList());
    }
   
}
