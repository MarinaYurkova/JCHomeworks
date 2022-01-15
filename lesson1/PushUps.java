package ru.geekbrains.lesson1;

public class PushUps extends Obstacle {

    public PushUps(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.push(super.getDifficulty());
    }
}
