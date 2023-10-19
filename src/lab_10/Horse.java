package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    protected final int MAX_SPEED = 75;

    @Override
    public void setName() {
        name = "Horse";
    }

    @Override
    public void setSpeed() {
        speed = new SecureRandom().nextInt(MAX_SPEED);
    }

    public Horse() {
        setSpeed();
        setName();
    }
}
