package patterns.singleton;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class DoubleCheckLazySingleton {

    private volatile static DoubleCheckLazySingleton singleton = null;

    private DoubleCheckLazySingleton() {
        super();
    }

    public static DoubleCheckLazySingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return singleton;
    }
}
