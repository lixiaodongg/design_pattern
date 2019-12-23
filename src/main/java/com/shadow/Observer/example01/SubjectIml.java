package com.shadow.Observer.example01;

import java.util.HashSet;
import java.util.Set;

/**
 * 目标类
 */
public class SubjectIml implements Subject {

    private Set<Observer> observerSet = new HashSet<>();

    @Override
    public Subject add(Observer observer) {
        broadCast("新增成员:" + observer.getName());
        observerSet.add(observer);
        return this;
    }

    @Override
    public void remove(Observer observer) {
        broadCast("移除成员:" + observer.getName());
        observerSet.remove(observer);
    }

    @Override
    public void notify2All() {
        observerSet.forEach(Observer::update);
    }

    @Override
    public void broadCast(String msg) {
        observerSet.forEach(observer -> observer.showMsg(msg));
    }
}
