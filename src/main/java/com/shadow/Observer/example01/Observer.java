package com.shadow.Observer.example01;

/**
 * 观察者接口
 */
public interface Observer {
    void update();

    void showMsg(String msg);

    String getName();
}
