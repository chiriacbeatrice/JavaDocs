package ro.teamnet.zerotohero.oop.Exceptions;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class CatchMulExp {

    public void err(int a, int b) {

        try {
            System.out.println(a / b);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Aici e eroare ex 10!!!");
        }
    }
}
