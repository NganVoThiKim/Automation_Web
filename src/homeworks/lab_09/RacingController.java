package homeworks.lab_09;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public static List<AnimalBuilder> filterRaceableAnimal(List<AnimalBuilder> animalList) {
        List<AnimalBuilder> raceableAnimalList = new ArrayList<>();
        for (AnimalBuilder animalBuilder : animalList) {
            if (!animalBuilder.isFlyable()) {
                raceableAnimalList.add(animalBuilder);
            }
        }
        return raceableAnimalList;
    }

    public static AnimalBuilder getWinner(List<AnimalBuilder> animalList) {
        AnimalBuilder winner = animalList.get(0);
        for (AnimalBuilder animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
