package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MosquitoTest {

    private Mosquito mosquito;

    @BeforeEach
    void setUp() {
        mosquito = new Mosquito("Mosquito", 6, true, true, true);
    }

    @Test
    void testToString() {
        assertEquals("Mosquito(super=Insect(name=Mosquito, numberOfLegs=6, hasWings=true, isDangerous=true), canBite=true)", mosquito.toString());
    }

    @Test
    void testCanInjectPoison() {
        assertEquals(mosquito.isCanBite(), mosquito.canInjectPoison());
    }

    @Test
    void testSurviveOverWinter() {
        Assertions.assertDoesNotThrow(mosquito::surviveOverWinter);
    }
}
