package ro.teamnet.zerotohero.oop.Exceptions;

import ro.teamnet.zerotohero.oop.Exceptions.MyExceptions;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class NestingException {

    public void nest(int a) throws MyExceptions {

        try {
            System.out.println(a / 0);
        } catch (Exception exp) {
            if (a > 5) {
                throw new MyExceptions("Ceva.");

            } else {
                throw new MyExceptions("Ceva nou.");
            }
        }

    }
}
