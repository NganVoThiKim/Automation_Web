package homeworks.lab_10;

import java.util.List;

public class RacingController {
    public static Animal getWinner(List<homeworks.lab_10.Animal> animalList){
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if(winner.getSpeed() < animal.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }
}
