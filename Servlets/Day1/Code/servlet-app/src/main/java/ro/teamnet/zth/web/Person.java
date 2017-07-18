package ro.teamnet.zth.web;

/**
 * Created by Beatrice.Chiriac on 7/18/2017.
 */
public class Person {

    public  String firstName;
    public String lastName;
    public Long age;
    public boolean married;

    public Person(String firstName, String lastName, Long age, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
