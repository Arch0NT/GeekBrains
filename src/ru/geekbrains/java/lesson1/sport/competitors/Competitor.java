package ru.geekbrains.java.lesson1.sport.competitors;

public interface Competitor {
    void run(int dist, CommentsNoComments comment);
    void swim(int dist, CommentsNoComments comment);
    void jump(int height, CommentsNoComments comment);
    void result();
    boolean isOnDistance();
}
