import entity.CivilStatus;
import entity.Route;
import entity.RouteTypes;
import patterns.strategy.RouteBuilderInterface;

import java.text.SimpleDateFormat;
import java.util.Date;

import static entity.CivilStatus.getStatus;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class CivilStatusTest {
    public static void main(String[] args) {
        CivilStatus st = CivilStatus.MARRIED;
        System.out.println("CivilStatus : " + CivilStatus.MARRIED.status);
        System.out.println("CivilStatus : " + CivilStatus.MARRIED.name());
        System.out.println("getStatus(st) : " + getStatus(st));
        System.out.println(currentTime());
    }

    public static String currentTime() {
        Date current = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd__HH:mm:ss");
        return f.format(current);
    }
}
