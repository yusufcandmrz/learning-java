package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {

    private List<User> users;

    public ChatMediatorImp() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != null) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
