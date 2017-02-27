package ru.geekbrains.java.Lesson23;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    private ArrayList<String> fio = new ArrayList<>();
    private ArrayList<String> phoneNumber = new ArrayList<>();

    public Phonebook() throws IOException {
        if (this.fio.isEmpty() && this.phoneNumber.isEmpty()) init();
    }

    public void init() throws IOException {
        Scanner scn = new Scanner(new File("D:\\Java_workspace\\Lesson23\\src\\Lesson23\\Base.txt"));
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
