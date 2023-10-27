package homeworks.lab_12;

public class ElephantSpeed implements RacingBehavior{
    int width;
    double rate;

    public ElephantSpeed(int width, double rate) {
        this.width = width;
        this.rate = rate;
    }

    @Override
    public double getSpeed() {
        return width * rate;
    }
}
