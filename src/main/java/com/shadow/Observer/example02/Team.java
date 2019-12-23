package com.shadow.Observer.example02;


import java.util.ArrayList;
import java.util.List;

public abstract class Team {
    protected String teamName;
    protected List<Member> players = new ArrayList<>();

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public abstract Team join(Member member);

    public abstract void quit(Member member);

    public void notifyAllMembers(String name) {
        System.out.println(name + "正在被攻击");
        players.forEach(member -> {
            if (!member.getName().equals(name)) {
                member.help();
            }
        });
    }
}
