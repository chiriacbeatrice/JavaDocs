package ro.teamnet.zerotohero.oop.Exceptions;

import ro.teamnet.zerotohero.oop.Exceptions.MyExceptions;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Foo {
    public int bar() throws MyExceptions {
        throw new MyExceptions("try again please");
    }
}
