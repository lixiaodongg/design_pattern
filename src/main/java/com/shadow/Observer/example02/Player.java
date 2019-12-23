package com.shadow.Observer.example02;

public class Player implements Member {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(name + ": 坚持住，我来帮你");
    }

    @Override
    public void beenAttacked(Team team) {
        team.notifyAllMembers(name);
    }
}
