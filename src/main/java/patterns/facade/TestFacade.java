package patterns.facade;

/**
 * Created by Ghazi Ennacer on 26/04/2017.
 */
public class TestFacade {

    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();
        SchedulerFacade facadeServer = new SchedulerFacade(scheduler);
        facadeServer.startScheduler();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopScheduler();
    }

}
