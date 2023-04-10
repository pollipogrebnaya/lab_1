package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Mosquito extends Insect {
    private boolean canBite = true;

    public Mosquito(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean canBite) {
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
