package patterns.factory;

/**
 * Created by Ghazi Ennacer on 17/04/2017.
 */
public class PrinterServiceB extends PrinterService {
    @Override
    protected Parser getParser() {
        return new ParserB();
    }
}
