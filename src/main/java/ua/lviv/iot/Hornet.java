package ua.lviv.iot;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Hornet extends Insect {
    private boolean canBite = true;

    public Hornet(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canBite) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canBite = canBite;
    }

    @Override
    public boolean canInjectPoison() {
        return canBite;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Hornet hibernate during winter...");
    }
}
