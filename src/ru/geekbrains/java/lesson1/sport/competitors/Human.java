package ru.geekbrains.java.lesson1.sport.competitors;

public class Human implements Competitor {
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 10000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.active = true;
    }

    @Override
    public void run(int dist, CommentsNoComments comment) {
        if (comment.isCommenting) {
            if (dist <= maxRunDistance) {
                System.out.println(name + " отлично справился с кроссом");
            } else {
                System.out.println(name + " не смог справиться с кроссом и сошел с дистанции");
            }
        }
        active = (dist <= maxRunDistance);
    }

    @Override
    public void jump(int height, CommentsNoComments comment) {
        if (comment.isCommenting) {
            if (height <= maxJumpHeight) {
                System.out.println(name + " отлично перепрыгнул через стену");
            } else {
                System.out.println(name + " не смог перепрыгнуть через стену и сошел с дистанции");
            }
        }
        active = (height <= maxJumpHeight);
    }

    @Override
    public void swim(int dist,CommentsNoComments comment) {
        if (comment.isCommenting) {
            if (dist <= maxSwimDistance) {
                System.out.println(name + " отлично проплыл");
            } else {
                System.out.println(name + " не смог справиться с заплывом и сошел с дистанции");
            }
        }
        active = (dist <= maxSwimDistance);
    }

    @Override
    public void result() {
        System.out.println(name + ": " + active);
    }
}
