package entity;

import java.io.Serializable;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class Route implements Serializable {
    public final String name;
    public final RouteTypes type;

    public Route(final String name, final RouteTypes type) {
        this.name = name;
        this.type = type;
    }
}
