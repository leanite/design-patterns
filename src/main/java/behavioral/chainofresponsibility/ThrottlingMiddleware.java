package behavioral.chainofresponsibility;

public class ThrottlingMiddleware extends Middleware {

    private int requestPerMinuteLimit;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinuteLimit) {
        this.requestPerMinuteLimit = requestPerMinuteLimit;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(String email, String password) {
        checkIfCanResetRequests();
        processRequest();

        return checkNext(email, password);
    }

    private void checkIfCanResetRequests() {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
    }

    private void processRequest() {
        request++;

        if (request > requestPerMinuteLimit) {
            System.out.println("Request limit exceeded!");
            System.exit(0);
        }
    }
}