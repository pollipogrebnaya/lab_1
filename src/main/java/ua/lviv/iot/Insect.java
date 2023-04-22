package ua.lviv.iot;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Insect {
    private String name;
    private int numberOfLegs;
    private boolean hasWings = false;
    private boolean isDangerous = false;

    public abstract boolean canInjectPoison();

    public abstract void surviveOverWinter();
}
