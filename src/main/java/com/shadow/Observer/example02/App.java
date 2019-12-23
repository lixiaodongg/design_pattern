package com.shadow.Observer.example02;

public class App {
    public static void main(String[] args) {
        Team team = new GoodTeam();
        Member p1 = new Player("李白");
        Member p2 = new Player("韩信");
        Member p3 = new Player("貂蝉");
        Member p4 = new Player("王昭君");
        team.join(p1).join(p2).join(p3).join(p4);
        p1.beenAttacked(team);
        p2.beenAttacked(team);
    }
}
