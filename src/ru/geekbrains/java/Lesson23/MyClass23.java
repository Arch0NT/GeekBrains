package ru.geekbrains.java.Lesson23;

import java.util.*;

public class MyClass23 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        initList(list);
        System.out.println(list.toString());

      /*1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся):
        а) Посчитать сколько раз встречается каждое слово;
        б) Найти список уникальных слов, из которых состоит массив (дубликаты не считаем);*/
        for (int j = 0; j < list.size(); j++) {
            if (!list.subList(0, j).contains(list.get(j)))
                System.out.println("Слово\t" + list.get(j) + " встречается " + Collections.frequency(list, list.get(j)) + " раз");
        }

        System.out.println();

      /*2 Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий
        и телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть,
        что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.*/
        Phonebook phonebook = new Phonebook();          //телефонная книга на ArrayList-ах
        PhonebookHM phonebookHM = new PhonebookHM();    //телефонная книга на HashMap-е и HashSet-е

        phonebook.add("Курпатов", "+7 785 345 67 82");
        System.out.println(phonebook.get("Смирнов"));
        System.out.println(phonebook.get("Курпатов"));

        phonebookHM.add("Курпатов", "+7 785 345 67 82");
        System.out.println(phonebookHM.get("Курпатов"));
        phonebookHM.add("Смирнов", "+7 777 333 24 05");
        System.out.println(phonebookHM.get("Смирнов"));

    }

    static void initList (ArrayList list){
        String str = "мама мыла раму триангуляция это процесс определения раму местоположения мама по трем точкам раму мыла мама super heroes";
        Scanner scn = new Scanner(str);
        while (scn.hasNext()) {
            list.add(scn.next());
        }
    }
}