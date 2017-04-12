package patterns.strategy;

import entity.Route;
import entity.RouteTypes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public interface RouteBuilderInterface {

    String buildRoute(Route route);

    boolean recognize(RouteTypes type);

    default String currentTime() {
        Date current = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd__HH:mm:ss");
        return f.format(current);
    }
}
