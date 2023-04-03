package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Beetle extends Insect {
    private boolean canRoll = true;

    public Beetle(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean canRoll) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canRoll = canRoll;
    }

    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Beetle hibernate during winter.");
    }
}
