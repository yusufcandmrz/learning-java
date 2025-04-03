package org.example;

public interface Subject {
    public void register(Observer object);

    public void unregister(Observer object);

    public void notifyObservers();

    public Object getUpdate(Observer object);
}
