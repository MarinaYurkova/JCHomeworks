package ru.geekbrains.lesson1;

public class Team {
    private TeamMember[] members;
    private final String nameTeam;

    public Team(String nameTeam, TeamMember... members) {
        this.members = members;
        this.nameTeam = nameTeam;
    }

    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда: " + nameTeam);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        System.out.println(member.getNameTeamMember() + " не прошел(а) полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        System.out.println(member.getNameTeamMember() + " успешно прошел(а) полосу препятствий");
    }

    public TeamMember[] getMembers() {
        return members;
    }

    private void printDivider() {
        System.out.println("--------------------------------------------------");
    }
}
