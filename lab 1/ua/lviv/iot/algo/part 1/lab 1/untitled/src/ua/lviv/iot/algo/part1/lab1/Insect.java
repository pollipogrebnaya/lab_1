package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Insect {
    protected String name;
    protected int numberOfLegs;
    protected boolean hasWings = false;
    protected boolean isDangerous = false;

    public abstract boolean canInjectPoison();

    public abstract void surviveOverWinter();
}


