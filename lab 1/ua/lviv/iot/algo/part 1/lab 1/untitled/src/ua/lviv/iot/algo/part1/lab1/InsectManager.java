package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InsectManager {
    private List<Insect> insects;

    public InsectManager() {
        insects = new ArrayList<>();
    }

    public void addInsect(Insect insect) {
        insects.add(insect);
    }

    public List<Insect> findInsectsByNumberOfLegs(int numberOfLegs) {
        Stream<Insect> insectStream = insects.stream()
                .filter(insect -> insect.getNumberOfLegs() == numberOfLegs);
        return insectStream.toList();
    }

    public List<Insect> findInsectsThatCanInjectPoison() {
        return insects.stream()
                .filter(Insect::canInjectPoison)
                .toList();
    }
}
