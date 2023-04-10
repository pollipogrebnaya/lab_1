package ua.lviv.iot.algo.part1.lab2;

public class InsectManagerMain {
    public static void main(String[] args) {
        InsectManager manager = new InsectManager() {};

        manager.addInsect(new Mosquito("Anopheles", 6, true, true, true));
        manager.addInsect(new Hornet("Vespa bicolor", 6, true, true, true));
        manager.addInsect(new Mosquito("Aedes albopictus", 6, true, true, true));
        manager.addInsect(new Hornet("Vespa crabro", 6, true, true, true));
        manager.addInsect(new Beetle("Scarabaeus sacer", 6, false, false, true));
        manager.addInsect(new Spider("Black widow", 8, false, true, true));
        manager.addInsect(new Beetle("Curculionidae", 6, false, false, true));
        manager.addInsect(new Spider("Sparassidae", 8, false, true, true));

        System.out.println("Insects with 6 legs:");
        manager.findInsectsByNumberOfLegs(6).forEach(System.out::println);

        System.out.println("\nInsects that can inject poison:");
        manager.findInsectsThatCanInjectPoison().forEach(System.out::println);
    }
}

