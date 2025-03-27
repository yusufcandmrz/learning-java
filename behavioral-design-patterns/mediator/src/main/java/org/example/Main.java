package org.example;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImp();
        User userOne = new UserImp(chatMediator, "userOne");
        User userTwo = new UserImp(chatMediator, "userTwo");
        User userThree = new UserImp(chatMediator, "userThree");
        chatMediator.addUser(userOne);
        chatMediator.addUser(userTwo);
        chatMediator.addUser(userThree);
        userOne.send("Hello world");
    }
}