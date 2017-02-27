package ru.geekbrains.java.Lesson23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PhonebookHM {
    private HashMap<String, String> phonebook = new HashMap<>();

    public PhonebookHM() {
        init();
    }

    private void init() {
        String str = "Смирнов\n+7 918 333 24 55\n" +
                "Иванов\n+7 918 333 24 54\n" +
                "Петров\n+7 918 333 24 53\n" +
                "Сидоров\n+7 918 333 24 52\n" +
                "Смирнов\n+7 913 333 24 55\n" +
                "Смирнов\n+7 918 333 24 88\n" +
                "Иванов\n+7 777 333 24 54\n" +
                "Петров\n+7 777 333 24 53\n" +
                "Сидоров\n+7 777 333 24 52\n" +
                "Смирнов\n+7 777 333 24 55";
        Scanner scn = new Scanner(str);
        while (scn.hasNext()) {
            String fio = scn.nextLine();
            String phoneNumber = scn.nextLine();
            phonebook.put(fio, phoneNumber);
        }
    }

    public void add(String fio, String phoneNumber) {
        phonebook.put(fio, phoneNumber);
    }

    public String get(String fio) {
        StringBuffer sb = new StringBuffer();
        Iterator<Map.Entry<String, String>> itr = phonebook.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (itr.hasNext()) {
            entry = itr.next();
            sb.append(entry.getKey() + " " + entry.getValue()+"\n");
        }

        return sb.toString();
    }

}
