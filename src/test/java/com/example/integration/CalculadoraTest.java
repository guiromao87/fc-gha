package com.example.integration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testaSoma() {
        var num1 = 10;
        var num2 = 15;
        var esperado = 25;

        Calculadora calculadora = new Calculadora();
        assertEquals(esperado, calculadora.soma(num1, num2));
    }
}
