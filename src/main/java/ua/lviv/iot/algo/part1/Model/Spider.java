package ua.lviv.iot.algo.part1.Model;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Spider extends Insect {
    public static final String HEADERS = "canWeaveWeb";
    private final boolean canWeaveWeb;

    public Spider(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean canWeaveWeb) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.canWeaveWeb = canWeaveWeb;
    }

    @Override
    public boolean canInjectPoison() {
        return true;
    }

    @Override
    public void surviveOverWinter() {
        System.out.println("Spider hibernates during winter.");
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = canWeaveWeb + "";
        return super.toCSV() + string;
    }
}

