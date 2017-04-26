package patterns.facade;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class SchedulerFacade {

    private final Scheduler scheduler;

    public SchedulerFacade(Scheduler scheduler){
        this.scheduler = scheduler;
    }

    public void startScheduler(){

        scheduler.start();
        scheduler.loadConfigurationFiles();
        scheduler.initialize();
        scheduler.initializeContext();
        scheduler.initializeListeners();
        scheduler.constructSystemModules();
    }

    public void stopScheduler(){

        scheduler.launchProcesses();
        scheduler.destory();
        scheduler.destroySystemModules();
        scheduler.destoryListeners();
        scheduler.destoryContext();
        scheduler.shutdown();
    }
}
