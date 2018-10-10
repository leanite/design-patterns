package structural.proxy.cmd;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) {
        System.out.println(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
