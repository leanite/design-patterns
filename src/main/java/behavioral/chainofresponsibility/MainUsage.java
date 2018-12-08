package behavioral.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainUsage {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        setupServer();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

    private static void setupServer() {
        server = new Server();
        server.register("admin@mail.com", "123456");
        server.register("user@mail.com", "654321");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }
}
