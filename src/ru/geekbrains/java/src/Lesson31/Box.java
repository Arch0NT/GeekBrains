package Lesson31;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private float amount;
    private T typeOfFruit;
    private ArrayList<T> innerSpace;

    public Box(T... fruits) {
        innerSpace = new ArrayList<T>(Arrays.asList(fruits));
        typeOfFruit = fruits[0];
        amount = amountCompute();
    }

    public float getAmount() {
        return amount;
    }

    public boolean compare(Box a) {
        return Float.compare(amount, a.getAmount()) == 0;
    }

    public void fillFromABox(Box<T> a) {
        innerSpace.addAll(a.innerSpace);
        amount += a.getAmount();
        a.amount = 0.0f;
        a.innerSpace.clear();
    }

    public void addFruits(T... fruits) {
        innerSpace.addAll(Arrays.asList(fruits));
        amount = amountCompute();
    }

    private float amountCompute (){
        return innerSpace.size() * typeOfFruit.getWeight();
    }
}
