package com.shadow.Observer.example01;

/**
 * 观察者实现类
 */
public class ObserverIml implements Observer {
    private String name;

    public ObserverIml(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": 执行更新!");
    }

    @Override
    public void showMsg(String msg) {
        System.out.println(name + "收到消息: " + msg);
    }

    @Override
    public String getName() {
        return name;
    }
}
