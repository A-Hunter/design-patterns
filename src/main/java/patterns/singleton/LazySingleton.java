package patterns.singleton;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class LazySingleton {

    private static LazySingleton singleton = null;
    private LazySingleton(){
        super();
    }
    public static LazySingleton getInstance(){
        if(singleton ==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
