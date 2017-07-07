package exercise3;

import exercise2.Student;

/**
 * Created by Beatrice.Chiriac on 7/7/2017.
 */
public class StudentClass1 extends StudentClass {

    public StudentClass1(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }


    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null|| getClass()!=o.getClass()) return false;
        StudentClass1 student=(StudentClass1) o;
        if(!firstName.equals(student.firstName)) return false;
        return true;
    }
}

