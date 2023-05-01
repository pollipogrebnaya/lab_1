package ua.lviv.iot.algo.part1.Model;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Hornet extends Insect {
    public static final String HEADERS = "canRoll";
    private final boolean canRoll;

    public Hornet(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canRoll) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canRoll = canRoll;
    }

    @Override
    public boolean canInjectPoison() {
        return canRoll;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Hornet hibernate during winter...");
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
