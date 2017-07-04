package ro.teamnet.zerotohero.oop.Exceptions;

import com.sun.org.apache.xpath.internal.operations.Neg;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class MultiCatch {

    public void err(int a, int b){

        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Aici e eroare 1.1!!!");
        }

        catch (Exception e)
        {
            System.out.println("Aici e eroare 1.2!!!");
        }

    }

}
