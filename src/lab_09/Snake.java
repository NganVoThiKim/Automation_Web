package lab_09;

import java.security.SecureRandom;

public class Snake extends Animal {
    public Snake(Builder builder) {
        final int MAX_SPEED = 20;
        builder = new Builder();
        Animal animal = builder
                .setSpeed(new SecureRandom().nextInt(MAX_SPEED))
                .setFlyable(false)
                .setName("Snake")
                .build();
    }
}
