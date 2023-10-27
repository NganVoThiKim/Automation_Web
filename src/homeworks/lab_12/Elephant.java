package homeworks.lab_12;

import java.security.SecureRandom;

public class Elephant extends Animal{
    private int width;
    private final double RATE = 6.0;
    public Elephant() {
        name = "Elephant";
        animalType = 1;
        quantityLegs = 4;
        width = new SecureRandom().nextInt(3, 4);
        racingBehavior = new ElephantSpeed(width, RATE);
    }
}
