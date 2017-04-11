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
        amount = innerSpace.size() * typeOfFruit.getWeight();
    }

    public float getAmount() {
        return amount;
    }

    public boolean compare(Box a) {
        return Float.compare(amount, a.getAmount()) == 0; //не придумал как сравнить флоаты по-другому
    }

    public void fillFromABox(Box<T> a) {
        innerSpace.addAll(a.innerSpace);
        amount += a.getAmount();
        a.amount = 0.0f;
        a.typeOfFruit = null;
        a.innerSpace.clear();
    }
}
