package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private String nameTeamMember;
    private int power;

    public TeamMember(String nameTeamMember, int power) {
        this.nameTeamMember = nameTeamMember;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getNameTeamMember() {
        return nameTeamMember;
    }

    public void jump(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," перепрыгнул(а) препятствие");
        }
        else {
            changeStatus(Status.NoPassedDistance," слишком слаб(а), чтобы перепрыгнуть");
        }
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," пробежал(а) дистанцию");
        }
        else {
            changeStatus(Status.NoPassedDistance,"  слишком слаб(а), чтобы пробежать дистанцию");
        }
    }

    public void push(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," сдал(а) отжимания");
        }
        else {
            changeStatus(Status.NoPassedDistance," слишком слаб(а), чтобы отжаться");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(nameTeamMember + message);
    }
}
