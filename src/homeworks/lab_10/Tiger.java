package homeworks.lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal{
    protected final int MAX_SPEED = 100;
    @Override
    public void setName() {
        name = "Tiger";
    }

    @Override
    public void setSpeed() {
        speed = new SecureRandom().nextInt(MAX_SPEED);
    }

    public Tiger() {
        setSpeed();
        setName();
    }
}
