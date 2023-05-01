package ua.lviv.iot.algo.part1.Model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)

public class Beetle extends Insect {
    public static final String HEADERS = "canRoll";
    private final boolean canRoll;

    public Beetle(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canRoll) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canRoll = canRoll;
    }

    public static void writeToFile(List<Beetle> beetleList, String fileName) {
    }

    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Beetle hibernate during winter.");
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = canRoll + "";
        return super.toCSV() + string;
    }
}
