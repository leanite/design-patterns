package creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;
    private static SerializedSingleton instance = null;

    private SerializedSingleton() {}

    public static SerializedSingleton getInstance() {
        if (instance == null)
            instance = new SerializedSingleton();

        return instance;
    }

    /*
        For Serializable classes, the readResolve method allows a class to
        replace/resolve the object read from the stream before it is returned to the caller.
        In this case, it makes sure the returned object from serialization is legit and not re-created
     */
    protected Object readResolve() {
        return getInstance();
    }
}
