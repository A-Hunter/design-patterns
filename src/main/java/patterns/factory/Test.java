package patterns.factory;

/**
 * Created by Ghazi Ennacer on 17/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        PrinterService serviceA = new PrinterServiceA();
        serviceA.display();

        PrinterService serviceB = new PrinterServiceB();
        serviceB.display();

        PrinterService serviceC = new PrinterServiceC();
        serviceC.display();

    }
}
