package ru.geekbrains.java.lesson1.sport.competitors;

public class Team {
    private String name;
    private Competitor [] competitors;

    public Team (String name){
        this.name=name;
        this.competitors = new Competitor[]{new Human("Bob"), new Cat("Barsik"), new Dog("Bobik"), new Dog("Sharik")};
    }

    public Team (String name, Competitor ... competitors){
        this.name=name;
        this.competitors = new Competitor[competitors.length];
        this.competitors=competitors;
    }

    public void showPositiveResult (){
        for (Competitor c: competitors) {
            if (c.isOnDistance()) c.result();
        }
    }

    private void showNegativeResult (){
        for (Competitor c: competitors) {
            if (!c.isOnDistance()) c.result();
        }
    }

    public void showResult (){
        System.out.println("\n===== RESULTS =====\n===== "+name+" =====");
        showPositiveResult();
        showNegativeResult();
    }

    public Competitor [] getCompetitors (){
        return competitors;
    }
}
