package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", cobertura.fizzBuzz(15));
        assertEquals("Fizz", cobertura.fizzBuzz(6));
        assertEquals("Buzz", cobertura.fizzBuzz(10));
        assertEquals("7", cobertura.fizzBuzz(7));

    }

    @Test
    void testNumeroCombinatorio() {
        assertEquals(1, cobertura.numeroCombinatorio(1,1));
        assertEquals(4, cobertura.numeroCombinatorio(4,3));
        assertEquals(1, cobertura.numeroCombinatorio(2,2));
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertEquals(3, cobertura.repeticionesConsecutivas(new int[]{1,1,1}));
        assertEquals(0, cobertura.repeticionesConsecutivas(new int[]{}));
        assertEquals(4, cobertura.repeticionesConsecutivas(new int[]{1,1,1,2,2,2,2}));
        assertEquals(1, cobertura.repeticionesConsecutivas(new int[]{1,2,3}));
    }
}
