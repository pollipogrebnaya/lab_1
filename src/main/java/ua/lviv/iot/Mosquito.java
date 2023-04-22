package ua.lviv.iot;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Mosquito extends Insect {
    private boolean canBite = true;



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
}
