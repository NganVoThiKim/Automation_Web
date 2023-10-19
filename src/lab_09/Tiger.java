package lab_09;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger(Builder builder) {
        final int MAX_SPEED = 100;
        builder = new Builder();
        lab_09.Animal animal = builder
                .setSpeed(new SecureRandom().nextInt(MAX_SPEED))
                .setFlyable(false)
                .setName("Tiger")
                .build();
    }
}
