package creational.singleton;

public class StaticBlockEagerInitializedSingleton {

    private static StaticBlockEagerInitializedSingleton instance = new StaticBlockEagerInitializedSingleton();

    static {
        //static block can be used to initialize static resources when class is loaded
        try {
            instance = new StaticBlockEagerInitializedSingleton();
        } catch(Exception e) {
            throw new RuntimeException("Exception occurred when creating creational.singleton instance");
        }
    }

    private StaticBlockEagerInitializedSingleton() {}

    public static StaticBlockEagerInitializedSingleton getInstance() {
        return instance;
    }
}
