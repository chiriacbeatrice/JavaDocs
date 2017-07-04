package ro.teamnet.zerotohero.oop.Exceptions;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Finally2 {
    public void fin2(int a, int b){

        try {
            System.out.println(a/b);
        }

        finally {
            System.out.println("Aici2!!!");
        }

    }
}
