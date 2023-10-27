package homeworks.lab_12;

public class HorseSpeed implements RacingBehavior{
    double speed;

    public HorseSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
