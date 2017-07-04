package ro.teamnet.zerotohero.oop.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class ExceptionResorces {

    public  void res(String p) throws MyExceptions{
        try{
            BufferedReader br=new BufferedReader(new FileReader(p));

        }
        catch (Exception exp){
            throw new MyExceptions("Nu s-a citit!");
        }
    }
}
