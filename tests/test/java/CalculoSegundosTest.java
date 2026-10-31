package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import gt.edu.umes.proy.calculo.LogicaDelNegocio;

public class CalculoSegundosTest {

    @Test
    void validarNumeroNoEntero() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        String[] parametros = {"1", "hola", "6", "20", "1"};

        assertThrows(IllegalArgumentException.class,
                () -> logica.calcularSegundos(parametros));
    }

    @Test
    void validarCalculoSegundos() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        String[] parametros = {"1", "3", "6", "20", "1"};

        long resultado = logica.calcularSegundos(parametros);

        assertEquals(4996860L, resultado);
    }
}