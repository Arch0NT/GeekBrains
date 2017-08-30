package Lesson31;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClass31 {
    public static void main(String[] args) {
        MyClass31 mc = new MyClass31();
        String[] arr = {"test0", "test1", "test2", "test3", "test4"};
        Integer[] arr1 = {0, 2, 1};

        System.out.println(Arrays.toString(arr));
        mc.swap(1, 2, arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr1));
        mc.swap(1, 2, arr1);
        System.out.println(Arrays.toString(arr1));

        ArrayList<String> sList = new ArrayList<>();
        ArrayList<Integer> iList = new ArrayList<>();

        sList = mc.morfArrayToArrayList(arr);
        sList.forEach(System.out::println);
        iList = mc.morfArrayToArrayList(arr1);
        iList.forEach(System.out::println);

        Box<Apple> aBox = new Box<>(new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> oBox = new Box<>(new Orange(), new Orange());
        Box<Apple> aBox1 = new Box<>(new Apple(), new Apple(), new Apple());
        System.out.println(aBox1.compare(oBox));
        System.out.println(aBox.getAmount() + " " + aBox1.getAmount());
        aBox.fillFromABox(aBox1);
        System.out.println(aBox.getAmount() + " " + aBox1.getAmount());
        aBox1.addFruits(new Apple());
        System.out.println(aBox1.getAmount());
    }

    public <T> void swap(int idx1, int idx2, T... arr) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public <T> ArrayList<T> morfArrayToArrayList(T... arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
