package ro.teamnet.zerotohero.oop.Exceptions;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Finally {

    public void fin(int a, int b){

        try {
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            System.out.println("Aici e eroare!!!");
        }
        finally {
            System.out.println("Aici!!!");
        }

    }
}
