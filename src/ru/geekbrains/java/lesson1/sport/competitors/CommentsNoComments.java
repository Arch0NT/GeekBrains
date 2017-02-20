package ru.geekbrains.java.lesson1.sport.competitors;

public enum CommentsNoComments {
    COMMENTS(true), NO_COMMENTS(false);

    boolean isCommenting;

    CommentsNoComments (boolean isCommenting){
        this.isCommenting=isCommenting;
    }

}
