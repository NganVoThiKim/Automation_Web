package homeworks.lab_12;

import java.security.SecureRandom;

public class Tiger extends Animal {

    int weight;
    final double RATE = 0.06;

    public Tiger() {
        name = "Tiger";
        animalType = 0;
        quantityLegs = 4;
        weight = new SecureRandom().nextInt(250, 400);
        racingBehavior = new TigerSpeed(weight, RATE);
    }
}
