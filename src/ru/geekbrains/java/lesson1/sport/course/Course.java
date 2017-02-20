package ru.geekbrains.java.lesson1.sport.course;

import ru.geekbrains.java.lesson1.sport.competitors.CommentsNoComments;
import ru.geekbrains.java.lesson1.sport.competitors.Competitor;
import ru.geekbrains.java.lesson1.sport.competitors.Team;

public class Course {
    private Obstacle [] course;

    public Course (){
        this.course = new Obstacle[]{new Cross(300), new Wall(2), new Cross(800), new Water(5)};
    }

    public Course (Obstacle... obstacles){
        this.course = new Obstacle[obstacles.length];
        this.course = obstacles;
    }

    public void doIt (Team team, CommentsNoComments comment){
        for (Obstacle o : course) {
            for (Competitor c: team.getCompetitors()) {
                o.doIt(c, comment);
            }
        }
    }

}
