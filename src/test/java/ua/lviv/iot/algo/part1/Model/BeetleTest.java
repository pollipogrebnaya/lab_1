package ua.lviv.iot.algo.part1.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BeetleTest {
    private Beetle beetle;

    @BeforeEach
    void setUp() {
        beetle = new Beetle("Beetle", 6, false, false, true);
    }

    @Test
    void testToString() {
        assertEquals("Beetle(super=Insect(name=Beetle, numberOfLegs=6, hasWings=false, isDangerous=false), canRoll=true)", beetle.toString());
    }

    @Test
    void canInjectPoison() {
        assertFalse(beetle.canInjectPoison());
    }

    @Test
    void testSurviveOverWinter() {
        Assertions.assertDoesNotThrow(beetle::surviveOverWinter);
    }

    @Test
    void testGetHeaders() {
        assertEquals("name, numberOfLegs, hasWings, isDangerous, canRoll", beetle.getHeaders());
    }

    @Test
    void testToCSV() {
        assertEquals("Beetle, 6, false, false, true", beetle.toCSV());
    }

    @Test
    void testWriteToFile() throws IOException {
        String fileName = "testFile.csv";

    }
}
