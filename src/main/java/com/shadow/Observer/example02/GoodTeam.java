package com.shadow.Observer.example02;

public class GoodTeam extends Team {
    @Override
    public Team join(Member member) {
        players.add(member);
        return this;
    }

    @Override
    public void quit(Member member) {
        players.remove(member);
    }
}
