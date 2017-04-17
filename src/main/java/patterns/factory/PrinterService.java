package patterns.factory;


/**
 * Created by Ghazi Ennacer on 17/04/2017.
 */
public abstract class PrinterService {

    public void display() {
        Parser parser = getParser();
        String msg = parser.print();
        System.out.println(msg);
    }

    protected abstract Parser getParser();
}
