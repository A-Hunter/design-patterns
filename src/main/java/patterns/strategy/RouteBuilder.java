package patterns.strategy;

import entity.Route;
import entity.RouteTypes;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 * <p>
 * This Strategy Pattern uses the SPI.
 * </p>
 */
public class RouteBuilder {
    private static final ServiceLoader<RouteBuilderInterface> LOADER =
            ServiceLoader.load(RouteBuilderInterface.class,
                    RouteBuilder.class.getClassLoader());

    public RouteBuilder() {
        throw new IllegalAccessError("Can't be initiated !!!");
    }

    public static String buildRoute(final Route route) {
        return lookupAppropriateRoute(route.type)
                .map(builder -> builder.buildRoute(route))
                .orElse(route.type + "-" + System.currentTimeMillis());
    }

    private static Optional<RouteBuilderInterface> lookupAppropriateRoute(final RouteTypes routeType) {
        for (RouteBuilderInterface b : LOADER) {
            if (b.recognize(routeType)) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }
}
