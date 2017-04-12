package patterns.strategy.context;

import entity.Route;
import entity.RouteTypes;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class RouteContextE  extends Route {
    private final Collection<String> info;

    public RouteContextE(String name, RouteTypes type, Collection<String> info) {
        super(name, type);
        this.info = info;
    }

    public void forEach(final Consumer<String> consumer) {
        info.forEach(consumer);
    }
}
