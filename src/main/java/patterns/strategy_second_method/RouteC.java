package patterns.strategy_second_method;

/**
 * Created by Ghazi Naceur on 31/05/2017.
 */
public class RouteC implements Strategy {
    @Override
    public void route(String argument) {
        System.out.println("You're using the Route C : "+ argument);
    }
}
