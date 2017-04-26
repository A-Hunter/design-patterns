package patterns.singleton;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class MultiThreadedLazySingleton {

    private static MultiThreadedLazySingleton singleton = null;
    private MultiThreadedLazySingleton(){}
    public static synchronized MultiThreadedLazySingleton getInstance(){
        if(singleton ==null){
            singleton = new MultiThreadedLazySingleton();
        }
        return singleton;
    }
}
