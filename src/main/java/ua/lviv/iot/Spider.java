package ua.lviv.iot;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Spider extends Insect {
    private boolean canWeaveWeb = true;

    public Spider(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canWeaveWeb) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canWeaveWeb = canWeaveWeb;
    }

    @Override
    public boolean canInjectPoison() {
        return true;
    }

    @Override
    public void surviveOverWinter()
    {
        System.out.println("Spider hibernate during winter.");
    }
}
