package org.example;

public class Main {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        Observer objectOne = new MyTopicSubscriber("objectOne");
        Observer objectTwo = new MyTopicSubscriber("objectTwo");
        Observer objectThree = new MyTopicSubscriber("objectThree");
        topic.register(objectOne);
        topic.register(objectTwo);
        topic.register(objectThree);
        objectOne.setSubject(topic);
        objectTwo.setSubject(topic);
        objectThree.setSubject(topic);
        topic.postMessage("New Message");
    }
}