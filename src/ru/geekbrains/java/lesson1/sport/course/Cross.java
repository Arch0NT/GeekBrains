package ru.geekbrains.java.lesson1.sport.course;

import ru.geekbrains.java.lesson1.sport.competitors.CommentsNoComments;
import ru.geekbrains.java.lesson1.sport.competitors.Competitor;

public class Cross extends Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor, CommentsNoComments comment) {
        competitor.run(dist, comment);
    }
}
