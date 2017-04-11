package entity;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public class Person {

    public final String firstName;
    public final String lastName;
    public final String gender;
    public final Integer age;
    public final String occupation;
    public final Address address;
    public final CivilStatus status;

    public Person(final String firstName, final String lastName, final String gender, final Integer age,
                  final String occupation, final Address address, final CivilStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
        this.status = status;
    }
}
