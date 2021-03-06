package com.example.farhan.socialappfeature.Models;

/**
 * Created by Farhan on 12/20/2017.
 */

public class Comment {

    private String Comment;
    private String key;
    private String userName;
    private String date;

    public Comment() {
    }

    public Comment(String userName, String comment, String date) {
        this.userName = userName;
        Comment = comment;
        this.date = date;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Comment='" + Comment + '\'' +
                ", key='" + key + '\'' +
                ", userName='" + userName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
