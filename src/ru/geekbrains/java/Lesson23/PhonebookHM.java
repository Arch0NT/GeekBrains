package ru.geekbrains.java.Lesson23;

import java.util.*;

public class PhonebookHM {
    private HashMap<String, HashSet<String>> phonebook = new HashMap<>();

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
            add(fio, phoneNumber);
        }
    }

    public void add(String fio, String phoneNumber) {
        if (!phonebook.containsKey(fio)){
            HashSet<String> setPhoneNumber = new HashSet<>();
            setPhoneNumber.add(phoneNumber);
            phonebook.put(fio, setPhoneNumber);
        } else {
            phonebook.get(fio).add(phoneNumber);
        }
    }

    public String get(String fio) {
        StringBuffer sb = new StringBuffer("У "+fio+" есть тел.\n===================\n");
        phonebook.get(fio).forEach(e -> sb.append(e+"\n"));
        return sb.toString();
    }
}