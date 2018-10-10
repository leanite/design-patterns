package structural.proxy.cmd;

public class CommandExecutorProxy implements CommandExecutor {

    private final String USER = "leanite";
    private final String PASSWORD = "123456";

    private boolean isRoot = false;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd){
        if(user.equals(USER) && pwd.equals(PASSWORD))
            isRoot =true;

        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isRoot) {
            executor.runCommand(cmd);
        }
        else {
            if(cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

}