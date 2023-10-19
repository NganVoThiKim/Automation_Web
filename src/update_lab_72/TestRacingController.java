package update_lab_72;

import java.util.Arrays;

public class TestRacingController {
    public static void main(String[] args) {
        Animal winner = RacingController.getWinner(Arrays.asList(new Dog(), new Horse(), new Tiger()));
        System.out.println("Winner is: "+ winner.getName());
        System.out.println("with speed: "+ winner.getSpeed());
    }

}
