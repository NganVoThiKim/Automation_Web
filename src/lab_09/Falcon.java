package lab_09;

import java.security.SecureRandom;

public class Falcon extends Animal {
    public Falcon(Builder builder) {
        final int MAX_SPEED = 90;
        builder = new Builder();
        lab_09.Animal animal = builder
                .setSpeed(new SecureRandom().nextInt(MAX_SPEED))
                .setFlyable(true)
                .setName("Falcon")
                .build();
    }

}
