package lab_72_homework;

import java.util.List;

public class AnimalController {
    public static String predict(List<lab_72_homework.Animal> animalList) {
        int max = 0;
        String winAnimal = "";
        for (Animal animal : animalList) {
            int getSpeed = animal.getSpeed();
            if (max <= getSpeed) {
                max = getSpeed;
                winAnimal = animal.getName();
            }
        }
        return "Winner is " + winAnimal + ", with speed: " + max;
    }
}
