package exercise3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Beatrice.Chiriac on 7/7/2017.
 */
public class StudentMain {

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry map = (Map.Entry)it.next();
            System.out.println(map.getKey() + " = " + map.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
    public static void main(String[] args) {
        Map<StudentClass1, BigDecimal> map1age = new HashMap<StudentClass1, BigDecimal>();

        map1age.put(new StudentClass1("Ion", "Vlad"), BigDecimal.valueOf(19));
        map1age.put(new StudentClass1("Ion", "Marcu"), BigDecimal.valueOf(20));
        map1age.put(new StudentClass1("Andrei", "Andrei"), BigDecimal.valueOf(25));
        printMap(map1age);

        Map<StudentClass2, BigDecimal> map2inaltime = new HashMap<StudentClass2, BigDecimal>();

        map2inaltime.put(new StudentClass2("Ion", "Vlad"), BigDecimal.valueOf(1.70));
        map2inaltime.put(new StudentClass2("Manea", "Alex"), BigDecimal.valueOf(1.63));
        map2inaltime.put(new StudentClass2("Andrei", "Andrei"), BigDecimal.valueOf(1.65));
        printMap(map2inaltime);

        Map<StudentClass3, BigDecimal> map3greutate = new HashMap<StudentClass3, BigDecimal>();

        map3greutate.put(new StudentClass3("Ion", "Vlad"), BigDecimal.valueOf(70));
        map3greutate.put(new StudentClass3("Maria", "Marcu"), BigDecimal.valueOf(43));
        map3greutate.put(new StudentClass3("Andrei", "Andrei"), BigDecimal.valueOf(65));
        printMap(map3greutate);

        Map<StudentClass4, BigDecimal> map4medie = new HashMap<StudentClass4, BigDecimal>();

        map4medie.put(new StudentClass4("Ion", "Vlad"), BigDecimal.valueOf(9.70));
        map4medie.put(new StudentClass4("Maria", "Marcu"), BigDecimal.valueOf(8.43));
        map4medie.put(new StudentClass4("Andrei", "Andrei"), BigDecimal.valueOf(8.65));
        printMap(map4medie);


    }


    }



