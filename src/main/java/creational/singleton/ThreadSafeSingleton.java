package creational.singleton;

public class ThreadSafeSingleton {

    /*
        By declaring a variable volatile, all writes to this variable will be written back to main memory immediately.
        Also, all reads of this variable will be read directly from main memory.
        Declaring a variable volatile thus guarantees the visibility for other threads of writes to that variable.
     */
    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null)
                instance = new ThreadSafeSingleton();
        }

        return instance;
    }

}
