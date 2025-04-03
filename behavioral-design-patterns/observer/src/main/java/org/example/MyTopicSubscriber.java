package org.example;

public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        System.out.println(message == null ? name + ":: No new message" : name + ":: Consuming message:: " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
