package exercise3;

/**
 * Created by Beatrice.Chiriac on 7/7/2017.
 */
public class StudentClass4 extends StudentClass{

    public StudentClass4(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int hashCode() {
        return 17*firstName.hashCode()+lastName.hashCode();
    }


    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null|| getClass()!=o.getClass()) return false;
        StudentClass1 student=(StudentClass1) o;
        if(!firstName.equals(student.firstName)) return false;
        if(!lastName.equals(student.lastName)) return false;

        return true;
    }
}
