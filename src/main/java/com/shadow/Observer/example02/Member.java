package com.shadow.Observer.example02;

public interface Member {
    String getName();

    void setName(String name);

    void help();

    void beenAttacked(Team team);
}
