package controle;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import modelo.Pessoa;
import persistencia.DaoPessoa;
import util.Input;
import util.excecoes.ExceptionCadastroPessoa;

public class ControlePessoa {

    private DaoPessoa dao;

    public ControlePessoa() {
        dao = new DaoPessoa();
    }

    public void cadastrar() throws ExceptionCadastroPessoa {
        Pessoa p = new Pessoa();
        setarDados(p);
        if (cadastroValido(p)) {
            dao.saveOrUpdate(p);
        }
    }

    public void editar(Pessoa p) throws ExceptionCadastroPessoa {
        setarDados(p);
        if (cadastroValido(p)) {
            dao.saveOrUpdate(p);
        }
    }

    public void setarDados(Pessoa p) {
        System.out.println("informe o nome: ");
        p.setNome(Input.nextLine());
        System.out.println("informe o CPF: ");
        p.setCpf(Input.next());
        System.out.println("informe o email: ");
        p.setEmail(Input.next());
        System.out.println("informe o telefone: ");
        p.setTelefone(Input.next());
    }

    public boolean cadastroValido(Pessoa p) throws ExceptionCadastroPessoa {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Pessoa>> violations = validator.validate(p);

        if (!violations.isEmpty()) {
            throw new ExceptionCadastroPessoa("Cadastro inválido!", violations);
        }
        return true;
    }

    public Pessoa carregarPorId(int id) {
        return (Pessoa) dao.findById(id);
    }

    public List<Pessoa> carregarTodos() {
        return dao.findAll().stream().map(e -> (Pessoa) e).collect(Collectors.toList());
    }
}
