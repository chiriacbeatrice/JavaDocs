package exercise0;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys) and
 *          print all its elements.
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughMap(){

        //  Exercise #0 a) Create a Map (HashMap) and add elements to it (using put() method)
        //  Exercise #0 a) Hint: Don't forget to specify the types of the key and value when creating the Map

        Map<Integer,String> MyMap=new HashMap<Integer, String>();
        MyMap.put(1,"unu");
        MyMap.put(2,"doi");
        MyMap.put(3,"trei");
        MyMap.put(4,"patru");
        MyMap.put(5,"cinci");

        //  Exercise #0 b) Iterate over the Map using keySet() method and print all its elements
        //  Exercise #0 b) The elements could be printed like this: [key1=value1, key2=value2, ...]
        Set<Integer> keyset=MyMap.keySet();

        System.out.println(MyMap);
        System.out.println("Key set values are: ");
        for (Integer key : keyset)
        {
            System.out.print(key+"="+MyMap.get(key)+", ");

        }





    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();
    }
}
