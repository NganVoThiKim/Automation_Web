package lab_09;

import java.util.List;

public class RacingController {
    public static boolean filterRaceableAnimal(boolean isFlyable) {
        if (!isFlyable) {
            return true;
        }
        return false;
    }

    public static Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (filterRaceableAnimal(animal.isFlyable())) {
                if (animal.getSpeed() > winner.getSpeed()) {
                    winner = animal;
                }
            }

        }
        return winner;
    }
}
