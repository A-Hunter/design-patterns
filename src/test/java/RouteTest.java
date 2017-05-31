import entity.RouteTypes;
import patterns.strategy.RouteBuilder;
import patterns.strategy.context.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ghazi Ennacer on 13/04/2017.
 */
public class RouteTest {
    public static void main(String[] args){
        Collection<String> col = new ArrayList<>();
        col.add("element1");
        col.add("element2");
        col.add("element3");
        col.add("element4");
        col.add("element5");
        RouteContextA a = new RouteContextA("aaa", RouteTypes.TYPE_A,col);
        String s = RouteBuilder.buildRoute(a);
        System.out.println(s);

        RouteContextB b = new RouteContextB("bbb", RouteTypes.TYPE_B,col);
        String s2 = RouteBuilder.buildRoute(b);
        System.out.println(s2);

        RouteContextC c = new RouteContextC("ccc", RouteTypes.TYPE_C,col);
        String s3 = RouteBuilder.buildRoute(c);
        System.out.println(s3);

        RouteContextD d = new RouteContextD("ddd", RouteTypes.TYPE_D,col);
        String s4 = RouteBuilder.buildRoute(d);
        System.out.println(s4);

        RouteContextE e = new RouteContextE("eee", RouteTypes.TYPE_E,col);
        String s5 = RouteBuilder.buildRoute(e);
        System.out.println(s5);
    }
}
