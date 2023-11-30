package modelo;

import java.time.LocalTime;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.validacoes.CargaHorariaMensal;

public class CargoTest {

    private static ValidatorFactory factory;
    private static Validator validator;
    private static Cargo cargo;
    private static Set<ConstraintViolation<Cargo>> violations;

    public CargoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cargo = new Cargo();
    }

    @After
    public void tearDown() {
    }

    private Set<ConstraintViolation<Cargo>> getViolationsField(Cargo c, String field) {
        Set<ConstraintViolation<Cargo>> violationsModel = validator.validate(c);
        return violationsModel.stream().filter(e -> e.getPropertyPath().toString().equalsIgnoreCase(field)).collect(Collectors.toSet());
    }

    @Test
    public void testarDescricaoEmBranco() {
        cargo.setDescricao("    ");
        violations = getViolationsField(cargo, "descricao");
        assertTrue("validar @NotBlank 1", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof NotBlank));
        assertFalse("validar @Size", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof Size));

        cargo.setDescricao("");
        violations = getViolationsField(cargo, "descricao");
        assertTrue("validar @NotBlank 2", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof NotBlank));
        assertTrue("validar @Size", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof Size));

        cargo.setDescricao(null);
        violations = getViolationsField(cargo, "descricao");
        assertTrue("validar @NotBlank 3", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof NotBlank));
        assertFalse("validar @Size", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof Size));

    }

    @Test
    public void testarTamanhoDescricao() {

        cargo.setDescricao("ed");
        violations = getViolationsField(cargo, "descricao");
        assertFalse("validar 2 caracteres  @NotBlank", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof NotBlank));
        assertTrue("validar 2 caracteres @Size", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof Size));

        cargo.setDescricao("and");
        violations = getViolationsField(cargo, "descricao");
        assertFalse("validar 3 caracteres @NotBlank", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof NotBlank));
        assertFalse("validar 3 caracteres  @Size", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof Size));

        cargo.setDescricao("DiretorDiretorDiretorDiretorDiretorDiretorDiretor");
        violations = getViolationsField(cargo, "descricao");
        assertFalse("validar mais de 90 caracteres @NotBlank", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof NotBlank));
        assertTrue("validar mais de 90 caracteres @Size", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof Size));

    }

    @Test
    public void testarCargaHorariaMensal(){
        
        cargo.setCargaHorariaMensal(LocalTime.of(10, 30, 00));
        violations = getViolationsField(cargo, "cargaHorariaMensal");
        assertFalse("validar cargaHorariaMensal @CargaHorariaMensal", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof CargaHorariaMensal));
        
        cargo.setCargaHorariaMensal(LocalTime.of(0, 0, 0));
        violations = getViolationsField(cargo, "cargaHorariaMensal");
        assertFalse("validar cargaHorariaMensal @CargaHorariaMensal", violations.stream().anyMatch(v -> v.getConstraintDescriptor().getAnnotation() instanceof CargaHorariaMensal));
       
    }
}
