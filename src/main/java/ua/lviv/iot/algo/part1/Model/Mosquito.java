package ua.lviv.iot.algo.part1.Model;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)

public class Mosquito extends Insect {
    public static final String HEADERS = "canBite";
    private final boolean canBite;

    public Mosquito(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canBite) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canBite = canBite;
    }

    @Override
    public boolean canInjectPoison() {
        return canBite;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Mosquito don't hibernate during winter!");
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = canBite + "";
        return super.toCSV() + string;
    }
}

