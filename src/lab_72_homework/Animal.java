package lab_72_homework;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int maxSpeed;

    public Animal() {
    }

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(getMaxSpeed());
        return randomSpeed;
    }
}
