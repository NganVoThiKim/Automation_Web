package homeworks.lab_12;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    private static Animal getWinner(List<Animal> animalList, double distanceKm) {
        List<Animal> tigers = new ArrayList<>();
        List<Animal> elephants = new ArrayList<>();
        List<Animal> horses = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal.quantityLegs == 4) {
                // Filter animal type
                if (animal.getAnimalType() == 0) {
                    tigers.add(animal);
                } else if (animal.getAnimalType() == 1) {
                    elephants.add(animal);
                } else if (animal.getAnimalType() == 2) {
                    horses.add(animal);
                }
            }
        }
        // Find max speed of animal group
        Animal tigerWin = tigers.get(0);
        for (int i = 1; i < tigers.size(); i++) {
            if (tigerWin.racingBehavior.getSpeed() < tigers.get(i).racingBehavior.getSpeed()) {
                tigerWin = tigers.get(i);
            }
        }
        Animal elephantWin = elephants.get(0);
        for (int i = 1; i < elephants.size(); i++) {
            if (elephantWin.racingBehavior.getSpeed() < elephants.get(i).racingBehavior.getSpeed()) {
                elephantWin = elephants.get(i);
            }
        }
        Animal horseWin = horses.get(0);
        for (int i = 1; i < horses.size(); i++) {
            if (horseWin.racingBehavior.getSpeed() < horses.get(i).racingBehavior.getSpeed()) {
                horseWin = horses.get(i);
            }
        }
        System.out.println("============ Max speed each animal type =====");
        System.out.println("Tiger win: " + tigerWin.racingBehavior.getSpeed());
        System.out.println("Elephant win: " + elephantWin.racingBehavior.getSpeed());
        System.out.println("Horse win: " + horseWin.racingBehavior.getSpeed());

        // v = s / t => t = s / v
        double distanceM = distanceKm * 1000;
        double tigerTime =  distanceM / tigerWin.racingBehavior.getSpeed();
        double elephantTime = distanceM / elephantWin.racingBehavior.getSpeed();
        double horseTime = distanceM / horseWin.racingBehavior.getSpeed();


        System.out.println("============ Min running time each animal type =====");
        System.out.println("Tiger time: " + tigerTime);
        System.out.println("Elephant time: " + elephantTime);
        System.out.println("Horse time: " + horseTime);

        // Compare time to get winner
        if (tigerTime < elephantTime && tigerTime < horseTime) {

            return tigerWin;
        } else if (elephantTime < tigerTime && elephantTime < horseTime) {

            return elephantWin;
        } else if (horseTime < tigerTime && horseTime < elephantTime) {

            return horseWin;
        }
        return null;
    }

    public static void runProgram(int repeat, double distantKm) {
        int countTiger = 0;
        int countElephant = 0;
        int countHorse = 0;
        for (int i = 0; i < repeat; i++) {
            List<Animal> animalList = new ArrayList<>();
            // Create animal list
            System.out.println("============ Speed of every animal =====");
            for (int quantityAnimal = 0; quantityAnimal < 2; quantityAnimal++) {
                Animal tiger = new Tiger();
                System.out.printf("Tiger %s with speed %s \n", quantityAnimal + 1, tiger.racingBehavior.getSpeed());
                animalList.add(tiger);
                Animal elephant = new Elephant();
                System.out.printf("Elephant %s with speed %s \n", quantityAnimal + 1, elephant.racingBehavior.getSpeed());
                animalList.add(elephant);
                Animal horse = new Horse();
                System.out.printf("Horse %s with speed %s \n", quantityAnimal + 1, horse.racingBehavior.getSpeed());
                animalList.add(horse);

            }
            Animal animalWinner = getWinner(animalList, distantKm);

            if (animalWinner != null) {
                if (animalWinner.getAnimalType() == 0) {
                    countTiger++;
                } else if (animalWinner.getAnimalType() == 1) {
                    countElephant++;
                } else if (animalWinner.getAnimalType() == 2) {
                    countHorse++;
                }
            }

        }
        System.out.printf("============> Run program %s rounds <============ \n" ,repeat);
        if (countTiger > countElephant && countTiger > countHorse) {
            System.out.println("      Winner is Tiger group with " + countTiger + " times");
        } else if (countElephant > countTiger && countElephant > countHorse) {
            System.out.println("      Winner is Elephant group with " + countElephant + " times");
        } else {
            System.out.println("      Winner is Horse group with " + countHorse + " times");
        }
    }

}
