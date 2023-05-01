package ua.lviv.iot.algo.part1.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Insect {
    public static final String HEADERS = "name, numberOfLegs, hasWings, isDangerous";
    private String name;
    private int numberOfLegs;
    private boolean hasWings = false;
    private boolean isDangerous = false;

    public abstract boolean canInjectPoison();

    public abstract void surviveOverWinter();

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        String string = name + ", " + numberOfLegs + ", " + hasWings + ", " + isDangerous + ", ";
        return string;
    }
}
