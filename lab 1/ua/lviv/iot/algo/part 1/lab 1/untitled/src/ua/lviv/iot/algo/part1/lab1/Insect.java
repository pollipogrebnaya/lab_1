package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Insect {
    private String name = "Insect";
    private int numberOfLegs;
    private boolean hasWings = false;
    private boolean isDangerous = false;
    private boolean isSleeping = false;

    public boolean isPoisonous() {
        return isDangerous;
    }

    public void hibernate() {
        isSleeping = true;
        System.out.println(name + " is hibernating...\n");
    }

    public void wakeUp() {
        isSleeping = false;
        System.out.println("\n" + name + " is waking up...");
    }
    private static Insect instance;

    public static Insect getInstance() {
        if (instance == null) {
            instance = new Insect();
        }
        return instance;
    }

    public static void main(String[] args) {
        Insect[] insects = new Insect[4];
        insects[0] = new Insect();
        insects[1] = new Insect("Scorpion", 6, false, true, true);
        insects[2] = Insect.getInstance();
        insects[3] = Insect.getInstance();

        for(int i = 0; i < insects.length; i++){
            System.out.println("Is " + insects[i].name + " poisonous? - " + insects[i].isPoisonous());
        }

        insects[1].wakeUp();
        insects[2].hibernate();

        for (Insect insect: insects)
            System.out.println(insect.toString());
    }
}