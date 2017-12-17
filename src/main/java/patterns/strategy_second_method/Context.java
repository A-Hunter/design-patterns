package patterns.strategy_second_method;

/**
 * Created by Ghazi Naceur on 31/05/2017.
 */
public class Context {

    public Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void executeRoute(String argument){
        strategy.route(argument);
    }
}
