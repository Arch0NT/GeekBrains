package Lesson7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyClass7 {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        ArrayList<Cat> cats = new ArrayList<>();
        int numberOfCats = 5;
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        for (int i = 0; i < numberOfCats; i++) {
            System.out.println("Дайте имя коту №" + (i + 1));
            cats.add(new Cat(scn.nextLine(), rnd.nextInt(10) + 1));
        }
        plate.info();
        plate.addFood(-89); // забрали из тарелки еду, что-то ее сильно много было ;-)
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
    }
}