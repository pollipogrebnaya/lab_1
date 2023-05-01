package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HornetTest {

    private Hornet hornet;

    @BeforeEach
    void setUp() {
        hornet = new Hornet("Hornet", 6, true, true, true);
    }

    @Test
    void testToString() {
        assertEquals("Hornet(super=Insect(name=Hornet, numberOfLegs=6, hasWings=true, isDangerous=true), CanRoll=true)", hornet.toString());
    }

    @Test
    void testCanInjectPoison() {
        assertEquals(hornet.isCanRoll(), hornet.canInjectPoison());
    }

    @Test
    void testSurviveOverWinter() {
        Assertions.assertDoesNotThrow(hornet::surviveOverWinter);
    }
}
