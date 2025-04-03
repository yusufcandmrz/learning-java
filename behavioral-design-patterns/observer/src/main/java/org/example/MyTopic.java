package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observerList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer object) {
        if (object == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observerList.contains(object)) observerList.add(object);
        }

    }

    @Override
    public void unregister(Observer object) {
        synchronized (MUTEX) {
            observerList.remove(object);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerListLocal = null;
        synchronized (MUTEX) {
            if (!changed) return;
            observerListLocal = new ArrayList<>(this.observerList);
            this.changed = false;
        }
        for (Observer object : observerList) {
            object.update();
        }
    }

    @Override
    public Object getUpdate(Observer object) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
