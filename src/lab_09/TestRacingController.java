package lab_09;

import java.util.Arrays;
import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        Animal winner = RacingController.getWinner(Arrays.asList(new Eagle(), new Falcon(), new Snake(), new Tiger()));
        System.out.println("Winner is: "+ winner.getName());
        System.out.println("with speed: "+ winner.getSpeed());
    }
}
