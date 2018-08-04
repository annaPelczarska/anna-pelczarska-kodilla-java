package com.kodilla.stream.forumuser;

import java.time.LocalDate;


public final class ForumUser {
    private final int userID;
    private final String userName;
    private final Sex sex;
    private final LocalDate birthDate;
    private final int postQuantity;

    public ForumUser(final int userID, final String userName, final Sex sex, final LocalDate birthDate, final int postQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postQuantity = postQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
