package Lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyClass7 {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        //List <Cat> cats = new ArrayList<>();
        int numberOfCats = 5;
        //в принципе можно и массив, но АррайЛист интереснее
        Cat [] cats = new Cat [numberOfCats];
        Scanner scn = new Scanner(System.in);
        //System.out.println("Сколько котов, вы готовы кормить");
        //int numberOfCats=scn.nextInt();
        //scn.nextLine();
        Random rnd = new Random();
        for (int i = 0; i < numberOfCats; i++) {
            System.out.println("Дайте имя коту №"+i);
            //cats.add(new Cat(scn.nextLine(), rnd.nextInt(10)));
            cats[i]=new Cat(scn.nextLine(), rnd.nextInt(10));
        }
        plate.info();
        plate.addFood(-89); // забрали из тарелки еду, что-то ее сильно много было ;-)
        for (Cat cat:cats) {
            cat.eat(plate);
        }

        for (Cat cat:cats) {
            cat.info();
        }
        plate.info();
    }
}