package homeworks.lab_09;

import homeworks.lab_09.AnimalBuilder.Builder;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        Builder builder = new Builder();
        AnimalBuilder Eagle = builder.setName("Eagle").setSpeed(new SecureRandom().nextInt(90)).setFlyable(true).build();
        AnimalBuilder Falcon = builder.setName("Falcon").setSpeed(new SecureRandom().nextInt(90)).setFlyable(true).build();
        AnimalBuilder Tiger = builder.setName("Tiger").setSpeed(new SecureRandom().nextInt(100)).setFlyable(false).build();
        AnimalBuilder Snake = builder.setName("Snake").setSpeed(new SecureRandom().nextInt(20)).setFlyable(false).build();

        List<AnimalBuilder> raceableAnimalList = RacingController.filterRaceableAnimal(Arrays.asList(Eagle, Falcon, Tiger, Snake));
        AnimalBuilder winner = RacingController.getWinner(raceableAnimalList);
        System.out.println("Winner is: " + winner.getName());
        System.out.println("with speed: " + winner.getSpeed());

    }
}
