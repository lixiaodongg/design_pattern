package com.shadow.Observer.example01;

/**
 * 目标接口
 */
public interface Subject {

    Subject add(Observer observer);

    void remove(Observer observer);

    void notify2All();

    void broadCast(String msg);
}
