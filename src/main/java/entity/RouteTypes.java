package entity;

import java.io.Serializable;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public enum RouteTypes implements Serializable {
    TYPE_A, TYPE_B, TYPE_C, TYPE_D, TYPE_E;

    public static boolean recognize(final String routeName) {
        for (RouteTypes r: RouteTypes.values()) {
            if (r.name().equals(routeName)){
                return true;
            }
        }
        return false;
    }
}
