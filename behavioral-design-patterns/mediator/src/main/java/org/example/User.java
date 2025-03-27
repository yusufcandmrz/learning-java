package org.example;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.mediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
