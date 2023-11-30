package modelo;

import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import util.validacoes.CargaHorariaMensal;

public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank(message = "A descricao não pode estar em branco")
    @Size(min = 3, max = 40, message = "O cargo deve conter entre 3 a 40 caracteres")
    private String descricao;
    
    @CargaHorariaMensal
    LocalTime cargaHorariaMensal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalTime getCargaHorariaMensal() {
        return cargaHorariaMensal;
    }

    public void setCargaHorariaMensal(LocalTime cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

}
