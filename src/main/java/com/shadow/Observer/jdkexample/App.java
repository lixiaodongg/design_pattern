package com.shadow.Observer.jdkexample;

import java.util.Observable;

public class App {

    public static void main(String[] args) {
        Observable subject = new JdkSubject();
        JdkObserver o1 = new JdkObserver("A");
        JdkObserver o2 = new JdkObserver("B");
        subject.addObserver(o1);
        subject.addObserver(o2);
    }
}
