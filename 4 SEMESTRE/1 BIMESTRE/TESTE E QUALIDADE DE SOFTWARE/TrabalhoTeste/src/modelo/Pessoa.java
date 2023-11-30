package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;
import util.validacoes.CPF;

public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 3, max = 90, message = "O nome deve conter entre 3 a 90 caracteres")
    @Pattern(regexp = "^[A-zÀ-ü \\'\\.]{3,90}", message = "nome inválido")
    private String nome;
    
    @NotBlank(message = "O CPF não pode estar em branco")
    @Size(min = 11, max = 14, message = "O CPF deve conter entre 11 a 14 caracteres")
    @Pattern(regexp = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9]{2}", message = "cpf inválido! o cpf deve estar no seguinte formato: xxx.xxx.xxx-xx")
    @CPF
    private String cpf;
    
    @Pattern(regexp = "(([\\w-\\.]+@[\\w-]+\\.{0,1}[\\w]{2,4}\\.{0,1}[\\w]{0,2})|[\\n\\r\\f]?)", message = "e-mail inválido")
    private String email;
    
    @Pattern(regexp = "((?:\\(?([0]?[1-9][0-9])?\\)?\\s?)(?:((?:9\\d|[2-9])\\d{3})\\-?(\\d{4}))|[\\n\\r\\f]?)", message = "telefone inválido! o telefone deve estar no seguinte formato: (0XX) XXXXX-XXXX")
    private String telefone;
    
    @NotNull(message = "O endereço não pode ser nulo!")
    private Endereco endereco;
    
    public Pessoa() {
        this.endereco = new Endereco();
    }

    public Pessoa(Integer id, String nome, String cpf, String email, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
