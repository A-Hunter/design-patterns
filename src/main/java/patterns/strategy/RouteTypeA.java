package patterns.strategy;

import entity.Route;
import entity.RouteTypes;
import patterns.strategy.context.RouteContextA;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class RouteTypeA implements RouteBuilderInterface {

    public RouteTypeA() {
        super();
    }

    @Override
    public String buildRoute(Route route) {

        RouteContextA r = (RouteContextA) route;
        AtomicBoolean append = new AtomicBoolean(true);
        StringBuilder b = new StringBuilder(currentTime());
        r.forEach(identifier -> {
            if (append.compareAndSet(true, false)) {
                b.append("-").append(r.type.name())
                        .append("-").append(currentTime());
            }

        });
        return b.toString();
    }

    @Override
    public boolean recognize(RouteTypes type) {
        return type.equals(RouteTypes.TYPE_A);
    }
}
