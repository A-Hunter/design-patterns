package patterns.strategy.context;

import entity.Route;
import entity.RouteTypes;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class RouteContextA extends Route {

    private final Collection<String> info;

    public RouteContextA(String name, RouteTypes type, Collection<String> info) {
        super(name, type);
        this.info = info;
    }

    public void forEach(final Consumer<String> consumer) {
        info.forEach(consumer);
    }
}
