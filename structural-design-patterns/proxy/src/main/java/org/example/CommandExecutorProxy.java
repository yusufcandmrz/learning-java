package org.example;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if ("Yusuf".equals(user) && "123123".equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImp();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
