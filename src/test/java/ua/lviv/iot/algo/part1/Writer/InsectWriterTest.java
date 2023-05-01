package ua.lviv.iot.algo.part1.Writer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.Model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class InsectWriterTest {

    private static final String RESULT_WRITER = "result.csv";
    private static final String EXPECTED_WRITER = "expected.csv";
    List<Insect> insects;
    private InsectWriter writer;

    @AfterAll
    public static void teardown() throws IOException {
        Files.deleteIfExists(Path.of("fileForTestWithWords.csv"));
    }

    @BeforeEach
    public void setup() throws IOException {
        insects = new ArrayList<>();
        writer = new InsectWriter();
        insects.add(new Mosquito("Anopheles", 6, true, true, true));
        insects.add(new Hornet("Vespa bicolor", 6, true, true, true));
        insects.add(new Mosquito("Aedes albopictus", 6, true, true, true));
        insects.add(new Hornet("Vespa crabro", 6, true, true, true));
        insects.add(new Beetle("Scarabaeus sacer", 6, false, false, true));
        insects.add(new Spider("Black widow", 8, false, true, true));
        insects.add(new Beetle("Curculionidae", 6, false, false, true));
        insects.add(new Spider("Sparassidae", 8, false, true, true));

        Files.deleteIfExists(Path.of(RESULT_WRITER));
    }

    @Test
    void testEmptyWrite() {
        writer.smartlyWrite(null, null);
        File file = new File(RESULT_WRITER);
        Assertions.assertFalse(file.exists());
    }

    @Test
    void testWriteListOfInsects() throws IOException {
        writer.smartlyWrite(insects, "result.csv");
        Path actual = new File(RESULT_WRITER).toPath();
        Path expected = new File(EXPECTED_WRITER).toPath();
        List<String> expectedLines = Files.readAllLines(expected);
        List<String> actualLines = Files.readAllLines(actual);
        Assertions.assertEquals(expectedLines, actualLines);
    }

    @Test
    void testWriteToExistingFile() throws IOException {
        var forTest = new FileWriter("fileForTestWithWords.csv");
        forTest.write("Internet Of Things");
        forTest.close();
        writer.smartlyWrite(insects, "fileForTestWithWords.csv");
        Path actual = new File("fileForTestWithWords.csv").toPath();
        Path expected = new File(EXPECTED_WRITER).toPath();
        List<String> expectedLines = Files.readAllLines(expected);
        List<String> actualLines = Files.readAllLines(actual);
        Assertions.assertEquals(expectedLines, actualLines);
    }
}
