package Lesson23;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    private ArrayList<String> fio = new ArrayList<>();
    private ArrayList<String> phoneNumber = new ArrayList<>();

    public Phonebook() {
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
            fio.add(scn.nextLine());
            phoneNumber.add(scn.nextLine());
        }
    }

    public void add(String fio, String phoneNumber) {
        this.fio.add(fio);
        this.phoneNumber.add(phoneNumber);
    }

    public String get(String fio) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.fio.size(); i++) {
            if (this.fio.get(i).equals(fio)) sb.append(fio + " " + phoneNumber.get(i) + "\n");
        }
        return sb.toString();
    }
}