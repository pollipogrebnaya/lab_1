package ua.lviv.iot.algo.part1.lab2;

import java.util.ArrayList;
import java.util.List;

public abstract class InsectManager<T extends Insect> {
    private List<T> insects = new ArrayList<>();

    public void addInsect(T insect) {
        insects.add(insect);
    }

    public List<T> findInsectsByNumberOfLegs(int numberOfLegs) {
        return insects.stream()
                .filter(insect -> insect.getNumberOfLegs() == numberOfLegs)
                .toList();
    }

    public List<T> findInsectsThatCanInjectPoison() {
        return insects.stream()
                .filter(Insect::canInjectPoison)
                .toList();
    }
}

