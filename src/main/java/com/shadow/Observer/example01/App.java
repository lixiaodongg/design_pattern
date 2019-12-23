package com.shadow.Observer.example01;

public class App {

    public static void main(String[] args) {
        Subject subject = new SubjectIml();
        Observer o1 = new ObserverIml("A");
        Observer o2 = new ObserverIml("B");
        Observer o3 = new ObserverIml("C");
        Observer o4 = new ObserverIml("D");
        subject.add(o1).add(o2).add(o3).add(o4);
        subject.remove(o1);
        subject.notify2All();
    }

}
