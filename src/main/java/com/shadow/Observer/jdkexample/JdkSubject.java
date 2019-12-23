package com.shadow.Observer.jdkexample;

import java.util.Observable;
import java.util.Observer;

public class JdkSubject extends Observable {
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
}
