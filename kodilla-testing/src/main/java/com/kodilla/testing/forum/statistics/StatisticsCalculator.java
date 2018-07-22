package com.kodilla.testing.forum.statistics;

import java.util. *;

public class StatisticsCalculator {

    private int userSum;
    private int postsSum;
    private int commentsSum;
    private double postAvPUser;
    private double commentAvPPost;


    public int getUserSum() {
        return userSum;
    }

    public int getPostsSum() {
        return postsSum;
    }

    public int getCommentsSum() {
        return commentsSum;
    }

    public double getPostAvPUser() {
        return postAvPUser;
    }

    public double getCommentAvPPost() {
        return commentAvPPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        userSum = statistics.usersNames().size();
        postsSum = statistics.postsCount();
        commentsSum = statistics.commentsCount();
        if(userSum>0) {
            postAvPUser = statistics.postsCount() / (double) userSum;
        }
        else postAvPUser = 0;
        if(postsSum > 0){
            commentAvPPost = commentsSum / (double) postsSum;}
        else commentAvPPost = 0;
    }

    public void showStatistics(){
        System.out.print("number of forum users: "+userSum+ ", "+"total of posts: "+postsSum+ ", "+"total of comments: "+commentsSum+ ", "+"post average per user: "+postAvPUser+", "+"comment average per post: "+commentAvPPost);
    }
}
