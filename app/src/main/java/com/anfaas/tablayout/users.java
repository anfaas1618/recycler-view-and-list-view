package com.anfaas.tablayout;

public class users {
    String name;
    int score;

    public users(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public users() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}