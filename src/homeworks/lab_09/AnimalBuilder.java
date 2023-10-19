package homeworks.lab_09;

public class AnimalBuilder {
    /* Racing animal with builder design pattern (adding attribute flyable)
    Eagle, Falcon, Tiger, Snake....
    Animal tiger = new Animal.Builder().withWings(false).....build();
    Animal falcon = new Animal.Builder().withWings(true).....build();
    */
    private String name;
    private int speed;
    private boolean flyable;

    public AnimalBuilder(AnimalBuilder.Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    // READ-ONLY

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        // WRITE-ONLY
        public AnimalBuilder.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder.Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalBuilder.Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public AnimalBuilder build(){
            return new AnimalBuilder(this);
        }
    }
}
