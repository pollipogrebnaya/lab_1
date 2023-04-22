package ua.lviv.iot.algo.part1;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Hornet extends Insect {
    private boolean canRoll = true;

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
}
