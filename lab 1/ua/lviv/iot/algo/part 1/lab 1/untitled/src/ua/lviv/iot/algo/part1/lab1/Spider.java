package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Spider extends Insect {
    private boolean canWeaveWeb = true;

    public Spider(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean canWeaveWeb) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canWeaveWeb = canWeaveWeb;
    }

    @Override
    public boolean canInjectPoison() {
        return true;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Spider hibernate during winter.");
    }
}

