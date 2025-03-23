package org.example;

public class Main {
    public static void main(String[] args) {
        CommandExecutorProxy commandExecutorProxy = new CommandExecutorProxy("Yusuf", "321321");
        try {
            commandExecutorProxy.runCommand("dir");
            commandExecutorProxy.runCommand("rm test.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}