public class Bird extends Animal {
    private double speed;

    public Bird () {}

    public Bird(int age, int weight) {
        super(age, weight);
    }

    public void fly() {
        System.out.println("翱翔天空 ！ ");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
