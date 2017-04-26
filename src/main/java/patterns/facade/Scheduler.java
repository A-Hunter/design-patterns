package patterns.facade;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class Scheduler {

    public void start(){
        System.out.println("Starting...");
    }

    public void loadConfigurationFiles(){
        System.out.println("Loading configuration files...");
    }

    public void initialize(){
        System.out.println("Initializing...");
    }

    public void initializeContext(){
        System.out.println("Initializing context...");
    }

    public void initializeListeners(){
        System.out.println("Initializing listeners...");
    }

    public void constructSystemModules(){
        System.out.println("Constructing system modules...");
    }

    public void launchProcesses(){
        System.out.println("Launching processes...");
    }

    public void destory(){
        System.out.println("Destorying...");
    }

    public void destroySystemModules(){
        System.out.println("Destroying system modules...");
    }

    public void destoryListeners(){
        System.out.println("Destroying listeners...");
    }

    public void destoryContext(){
        System.out.println("Destroying context...");
    }

    public void shutdown(){
        System.out.println("Shutting down...");
    }
}
