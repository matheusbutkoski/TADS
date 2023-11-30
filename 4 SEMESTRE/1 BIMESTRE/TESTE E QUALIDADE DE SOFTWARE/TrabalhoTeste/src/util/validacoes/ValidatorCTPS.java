/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Peruzzo
 */
public class ValidatorCTPS implements ConstraintValidator<CTPS, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return value == null || value.toString().isEmpty() || validarCtps(value.toString());
    }

    public boolean validarCtps(String ctps) {

        // Remover caracteres não numéricos
        String ctpsNumerica = ctps.replaceAll("[^0-9]", "");

        // Verificar se a CTPS possui o número de caracteres correto
        if (ctpsNumerica.length() != 7 && ctpsNumerica.length() != 8) {
            return false;
        }

        // Verificar se a CTPS possui apenas dígitos repetidos
        if (ctpsNumerica.matches("^(\\d)\\1*$")) {
            return false;
        }

        // Verificar se os dois últimos dígitos estão corretos (algoritmo Módulo 11)
        int[] multiplicadores = {9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        int digitoVerificador = Integer.parseInt(ctpsNumerica.substring(ctpsNumerica.length() - 1));
        int numeroSemDigito = Integer.parseInt(ctpsNumerica.substring(0, ctpsNumerica.length() - 1));
        int restoDivisao;

        for (int i = 0; i < multiplicadores.length; i++) {
            soma += Integer.parseInt(String.valueOf(numeroSemDigito).substring(i, i + 1)) * multiplicadores[i];
        }

        restoDivisao = soma % 11;
        if (restoDivisao == 10) {
            restoDivisao = 0;
        }

        if (restoDivisao != digitoVerificador) {
            return false;
        }

        return true;
    }
}
