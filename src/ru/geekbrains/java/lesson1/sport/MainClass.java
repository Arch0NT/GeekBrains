package ru.geekbrains.java.lesson1.sport;

import ru.geekbrains.java.lesson1.sport.competitors.*;
import ru.geekbrains.java.lesson1.sport.course.*;

public class MainClass {
    public static void main(String[] args) {

        Team t1 = new Team("Human team", new Human("Vasiliy"), new Human("Tatyana"), new Human("Vladimir"));
        Team t2 = new Team("Cat team", new Cat("Red"), new Cat("Tiger"), new Cat("Panther"));
        Team t3 = new Team("Dog team", new Dog("Palkan"), new Dog("Baron"), new Dog("Sharik"));
        Team t4 = new Team("Complex team", new Human("Bob"), new Dog("Bobik"), new Cat("Barsik"));
        Course course = new Course(new Cross(100), new Wall(2), new Cross(500), new Water(20));

        CommentsNoComments comment;
        if (args.length>0&&args[0].equals("-nc")) comment=CommentsNoComments.NO_COMMENTS;
        else comment=CommentsNoComments.COMMENTS;

        course.doIt(t1, comment);
        course.doIt(t2, comment);
        course.doIt(t3, comment);
        course.doIt(t4, comment);

        t1.showResult();
        t2.showResult();
        t3.showResult();
        t4.showResult();
    }
}
