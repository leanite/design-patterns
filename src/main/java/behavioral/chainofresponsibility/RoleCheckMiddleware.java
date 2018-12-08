package behavioral.chainofresponsibility;

public class RoleCheckMiddleware extends Middleware {

    public boolean check(String email, String password) {
        if (email.contains("admin")) {
            System.out.println("Hello, admin!");
        }
        else {
            System.out.println("Hello, user!");
        }

        return checkNext(email, password);
    }
}
