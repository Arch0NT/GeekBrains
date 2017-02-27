package ru.geekbrains.java.Lesson23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyClass23 {
    public static void main(String[] args) throws IOException{
        ArrayList <String> list = new ArrayList<>();
        String str = "мама мыла раму триангуляция это процесс определения раму местоположения мама по трем точкам раму мыла мама super heroes";
        Scanner scn = new Scanner(str);
        while (scn.hasNext()) {
            list.add(scn.next());
        }
        System.out.println(list.toString());
        for (int j = 0; j < list.size(); j++) {
            if (!list.subList(0,j).contains(list.get(j)))
                System.out.println("Слово\t"+list.get(j)+" встречается "+Collections.frequency(list,list.get(j))+" раз");
        }
        System.out.println();
        Phonebook phonebook = new Phonebook();
        PhonebookHM phonebookHM = new PhonebookHM();
        phonebook.add("Курпатов", "+7 785 345 67 82");
        System.out.println(phonebook.get("Смирнов"));
        System.out.println(phonebook.get("Курпатов"));

        phonebookHM.add("Курпатов", "+7 785 345 67 82");
        System.out.println(phonebookHM.get("Смирнов"));

    }
}
