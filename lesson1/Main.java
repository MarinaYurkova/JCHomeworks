package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        Team winners = new Team("Winners",
                new TeamMember("Viktor", 10),
                new TeamMember("Sergey", 12),
                new TeamMember("Maria", 9),
                new TeamMember("Vitalina" ,10));

        Course course = new Course(new Cross(8), new Jumping(10), new PushUps(11));
        course.doIt(winners);

        winners.showResults();
    }
}
