package ua.lviv.iot;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Beetle extends Insect {
    private boolean canRoll = true;

    public Beetle(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canRoll) {
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
