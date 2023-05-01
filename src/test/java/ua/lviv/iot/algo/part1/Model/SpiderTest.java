package ua.lviv.iot.algo.part1.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.Model.Spider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpiderTest {
    private Spider spider;

    @BeforeEach
    void setUp() {
        spider = new Spider("Spider", 8, false, true, true);
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Spider(super=Insect(name=Spider, numberOfLegs=8, hasWings=false, isDangerous=true), canWeaveWeb=true)", spider.toString());
    }

    @Test
    void canInjectPoison() {
        assertTrue(spider.canInjectPoison());
    }

    @Test
    void testSurviveOverWinter() {
        Assertions.assertDoesNotThrow(spider::surviveOverWinter);
    }

    @Test
    void testGetHeaders() {
        assertEquals("name, numberOfLegs, hasWings, isDangerous, canWeaveWeb", spider.getHeaders());
    }

    @Test
    void testToCSV() {
        assertEquals("Spider, 8, false, true, true", spider.toCSV());
    }
}
