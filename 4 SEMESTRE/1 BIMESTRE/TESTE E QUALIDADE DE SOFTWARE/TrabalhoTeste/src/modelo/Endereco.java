package modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank
    @Size(min = 1, max = 200, message = "A cidade deve conter entre 0 e 200 caracteres")
    @Pattern(regexp = "\\D+", message = "Cidade inválida! A cidade deve conter apenas letras")
    String cidade;

    @NotBlank
    @Size(min = 1, max = 200, message = "O bairro deve conter entre 0 e 200 caracteres")
    String bairro;

    @NotBlank
    @Size(min = 1, max = 200, message = "A rua deve conter entre 0 e 200 caracteres")
    String rua;

    @NotBlank
    @Size(min = 1, max = 200, message = "O numero deve conter entre 0 e 200 caracteres")
    @Pattern(regexp = "^[0-9]+$", message = "Numero inválido! O numero não pode conter letras")
    String numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
