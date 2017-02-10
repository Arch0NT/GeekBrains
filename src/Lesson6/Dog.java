package Lesson6;

public class Dog extends Animal {
    private int limToRun = 500;
    private int limToSwim = 10;
    private double limToJump = 0.5;

    public Dog() {
    }

    public Dog(int limToRun) {
        this.limToRun = limToRun;
    }

    public Dog(int limToRun, int limToSwim) {
        this.limToRun = limToRun;
        this.limToSwim = limToSwim;
    }

    public Dog(int limToRun, int limToSwim, double limToJump) {
        this.limToRun = limToRun;
        this.limToSwim = limToSwim;
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

    public void setLimToSwim(int limToSwim) {
        this.limToSwim = limToSwim;
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
        return "swim: "+(swim <= limToSwim);
    }

    public String jump(double jump) {
        return "jump: "+(jump <= limToJump);
    }
}
