package homeworks.lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    protected final int MAX_SPEED = 60;

    @Override
    public void setName() {
        name = "Dog";
    }

    @Override
    public void setSpeed(){
        speed = new SecureRandom().nextInt(MAX_SPEED);
    }

    public Dog() {
        setSpeed();
        setName();
    }
}
