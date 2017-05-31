package patterns.strategy_second_method;

/**
 * Created by Ghazi Naceur on 31/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Context contextA = new Context(new RouteA());
        contextA.executeRoute("context A");

        Context contextB = new Context(new RouteB());
        contextB.executeRoute("context B");

        Context contextC = new Context(new RouteC());
        contextC.executeRoute("context C");

        Context contextD = new Context(new RouteD());
        contextD.executeRoute("context D");

        Context contextE = new Context(new RouteE());
        contextE.executeRoute("context E");
    }
}
