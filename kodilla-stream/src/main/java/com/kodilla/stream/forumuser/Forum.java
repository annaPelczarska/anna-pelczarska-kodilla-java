package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1234, "Barbie", Sex.M, LocalDate.of(1997, 3, 28), 13));
        userList.add(new ForumUser(1111, "Jasmin", Sex.M, LocalDate.of(1990, 8, 20), 3));
        userList.add(new ForumUser(1222, "Fiona",Sex.F, LocalDate.of(1990, 11, 13), 40));
        userList.add(new ForumUser(1555, "Mystique",Sex.M, LocalDate.of(1991, 1, 5), 0));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
