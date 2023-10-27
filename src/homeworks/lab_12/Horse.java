package homeworks.lab_12;

import java.security.SecureRandom;

public class Horse extends Animal{
    double speed;
    public Horse() {
        name = "Horse";
        animalType = 2;
        quantityLegs = 4;
        speed = new SecureRandom().nextInt(15, 24);
        racingBehavior = new HorseSpeed(speed);
    }
}
