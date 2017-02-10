package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full =false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate plate){
        full=plate.foodEaten(appetite);
    }

    public String toString (){
        return String.format("Is cat %s full: %b\n",name,full);
    }

    public void info (){
        System.out.printf(toString());
    }
}
