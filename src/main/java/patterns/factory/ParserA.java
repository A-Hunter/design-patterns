package patterns.factory;

/**
 * Created by Ghazi Ennacer on 17/04/2017.
 */
public class ParserA implements Parser {
    @Override
    public String print() {
        System.out.println("Parser A");
        return "Parser A";
    }
}
