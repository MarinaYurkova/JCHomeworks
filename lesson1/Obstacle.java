package ru.geekbrains.lesson1;

public abstract class Obstacle {

    private int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void goChallenge (TeamMember member) {}

}
