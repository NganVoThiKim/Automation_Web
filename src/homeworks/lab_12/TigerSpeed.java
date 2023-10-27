package homeworks.lab_12;

public class TigerSpeed implements RacingBehavior{
    int weight;
    double rate;

    public TigerSpeed(int weight, double rate) {
        this.weight = weight;
        this.rate = rate;
    }

    @Override
    public double getSpeed() {
        return weight * rate;
    }
}
