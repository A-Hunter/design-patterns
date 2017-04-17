package patterns.factory;

/**
 * Created by Ghazi Ennacer on 17/04/2017.
 */
public class ParserB implements Parser {
    @Override
    public String print() {
        System.out.println("Parser B");
        return "Parser B";
    }
}
