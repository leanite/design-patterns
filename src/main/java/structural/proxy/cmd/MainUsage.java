package structural.proxy.cmd;

public class MainUsage {

    public static void main(String[] args) {
        String user = "user";
        CommandExecutor userExecutor = new CommandExecutorProxy(user, "abcde");
        try {
            System.out.println("\n"+ user + " running ...");
            userExecutor.runCommand("ls -la");
            userExecutor.runCommand("rm -rf *");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }

        String root = "leanite";
        CommandExecutor rootExecutor = new CommandExecutorProxy(root, "123456");
        try {
            System.out.println("\n"+ root + " running ...");
            rootExecutor.runCommand("cd /");
            rootExecutor.runCommand("rm -rf *");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
