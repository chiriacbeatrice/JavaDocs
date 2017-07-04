package ro.teamnet.zerotohero.oop.Exceptions;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Propagation {

    public void method1(int a, int b)
    {
        System.out.println(a/b);
    }

    public void method2(int a,int b)
    {
        method1(a,b);
    }

    public void method3(int a,int b) throws Exception
    {
        try{

            method2(a,b);

        }
        catch (Exception e){
            System.out.println("Aici e eroare!!!");
        }
    }

}
