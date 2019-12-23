package com.shadow.Observer.jdkexample;

import java.util.Observable;
import java.util.Observer;

public class JdkObserver implements Observer {

    private String name;

    public JdkObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到消息");
    }
}
