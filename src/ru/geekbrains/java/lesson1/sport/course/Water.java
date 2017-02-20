package ru.geekbrains.java.lesson1.sport.course;

import ru.geekbrains.java.lesson1.sport.competitors.CommentsNoComments;
import ru.geekbrains.java.lesson1.sport.competitors.Competitor;

public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor, CommentsNoComments comment) {
        competitor.swim(dist, comment);
    }
}
