package ua.lviv.iot.algo.part1.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.Model.Hornet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HornetTest {

    private Hornet hornet;

    @BeforeEach
    void setUp() {
        hornet = new Hornet("Hornet", 6, true, true, true);
    }

    @Test
    void testToString() {
        assertEquals("Hornet(super=Insect(name=Hornet, numberOfLegs=6, hasWings=true, isDangerous=true), canRoll=true)", hornet.toString());
    }

    @Test
    void testCanInjectPoison() {
        assertEquals(hornet.isCanRoll(), hornet.canInjectPoison());
    }

    @Test
    void testSurviveOverWinter() {
        Assertions.assertDoesNotThrow(hornet::surviveOverWinter);
    }

    @Test
    void testGetHeaders() {
        assertEquals("name, numberOfLegs, hasWings, isDangerous, canRoll", hornet.getHeaders());
    }

    @Test
    void testToCSV() {
        assertEquals("Hornet, 6, true, true, true", hornet.toCSV());
    }
}
