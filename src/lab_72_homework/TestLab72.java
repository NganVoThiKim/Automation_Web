package lab_72_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLab72 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        System.out.println(AnimalController.predict(Arrays.asList(dog, horse, tiger)));
    }
}
