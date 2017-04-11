package entity;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class Address {

    public final Integer roadNumber;
    public final String roadName;
    public final String city;
    public final String country;

    public Address(final Integer roadNumber, final String roadName, final String city, final String country) {
        this.roadNumber = roadNumber;
        this.roadName = roadName;
        this.city = city;
        this.country = country;
    }
}
