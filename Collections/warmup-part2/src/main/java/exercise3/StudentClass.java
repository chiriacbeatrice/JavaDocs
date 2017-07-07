package exercise3;

/**
 * Created by Beatrice.Chiriac on 7/7/2017.
 */
public class StudentClass {
    public String firstName;
    public  String lastName;

    public StudentClass( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName){this.firstName=firstName;}

    public void setLastName(String lastName){this.lastName=lastName;}

}
