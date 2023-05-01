package ua.lviv.iot.algo.part1.Manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.Manager.InsectManager;
import ua.lviv.iot.algo.part1.Model.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsectManagerTest {
    private InsectManager manager;

    @BeforeEach
    public void setUp() {
        manager = new InsectManager();

        manager.addInsect(new Mosquito("Anopheles", 6, true, true, true));
        manager.addInsect(new Hornet("Vespa bicolor", 6, true, true, true));
        manager.addInsect(new Mosquito("Aedes albopictus", 6, true, true, true));
        manager.addInsect(new Hornet("Vespa crabro", 6, true, true, true));
        manager.addInsect(new Beetle("Scarabaeus sacer", 6, false, false, true));
        manager.addInsect(new Spider("Black widow", 8, false, true, true));
        manager.addInsect(new Beetle("Curculionidae", 6, false, false, true));
        manager.addInsect(new Spider("Sparassidae", 8, false, true, true));
    }

    @Test
    void testAddInsect() {
        int initialSize = manager.findInsectsByNumberOfLegs(4).size();
        Insect insect = new Mosquito("test", 4, false, false, false);
        manager.addInsect(insect);
        List<Insect> result = manager.findInsectsByNumberOfLegs(4);
        assertEquals(initialSize + 1, result.size());
        assertEquals(insect, result.get(result.size() - 1));
    }

    @Test
    void testFindInsectsByNumberOfLegs() {
        List<Insect> result = manager.findInsectsByNumberOfLegs(6);
        assertEquals(6, result.size());
        assertEquals("Anopheles", result.get(0).getName());
        assertEquals("Vespa bicolor", result.get(1).getName());
        assertEquals("Aedes albopictus", result.get(2).getName());
        assertEquals("Vespa crabro", result.get(3).getName());
        assertEquals("Scarabaeus sacer", result.get(4).getName());
        assertEquals("Curculionidae", result.get(5).getName());
    }

    @Test
    void testFindInsectsThatCanInjectPoison() {
        List<Insect> result = manager.findInsectsThatCanInjectPoison();

        assertEquals(6, result.size());
        assertEquals("Anopheles", result.get(0).getName());
        assertEquals("Vespa bicolor", result.get(1).getName());
        assertEquals("Aedes albopictus", result.get(2).getName());
        assertEquals("Vespa crabro", result.get(3).getName());
        assertEquals("Black widow", result.get(4).getName());
        assertEquals("Sparassidae", result.get(5).getName());
    }
}
