package patterns.singleton;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();
    private EagerSingleton(){
        super();
    }
    public static EagerSingleton getInstance(){
        return singleton;
    }
}
