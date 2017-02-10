package Lesson7;

public class Plate {
    private int food;

    public Plate (int food){
        this.food=food;
    }

    public void info (){
        System.out.println(toString());
    }

    public String toString (){
        return "plate: "+food;
    }

    public boolean foodEaten (int eat){
        if (eat<food) {
            food-= eat;
            return true;
        }
        return false;
    }

    public void addFood (int food){
        this.food+=food;
    }
}
