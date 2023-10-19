package lab_09;

public class Animal {
    /* Racing animal with builder design pattern (adding attribute flyable)
    Eagle, Falcon, Tiger, Snake....
    Animal tiger = new Animal.Builder().withWings(false).....build();
    Animal falcon = new Animal.Builder().withWings(true).....build();
    */
    private String name;
    private int speed;
    private boolean flyable;

    public Animal(Builder builder) {
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
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public Animal build(){
            return new Animal(this);
        }
    }
}
