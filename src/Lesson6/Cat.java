package Lesson6;

public class Cat extends Animal {
    private int limToRun = 200;
    private final int limToSwim = 0; // cat can't to swim
    private double limToJump = 2;

    public Cat() {
    }

    public Cat(int limToRun) {
        this.limToRun = limToRun;
    }

    public Cat(int limToRun, double limToJump) {
        this.limToRun = limToRun;
        this.limToJump = limToJump;
    }

    public int getLimToRun() {
        return limToRun;
    }

    public void setLimToRun(int limToRun) {
        this.limToRun = limToRun;
    }

    public int getLimToSwim() {
        return limToSwim;
    }

    public double getLimToJump() {
        return limToJump;
    }

    public void setLimToJump(double limToJump) {
        this.limToJump = limToJump;
    }

    public String run(int run) {
        return "run: "+(run <= limToRun);
    }

    public String swim(int swim) {
        return "swim: "+false;
    }

    public String jump(double jump) {
        return "jump: "+(jump <= limToJump);
    }
}
