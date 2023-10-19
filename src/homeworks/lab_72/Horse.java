package homeworks.lab_72;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse() {
        final int MAX_SPEED = 75;
        this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Horse");
    }
}
