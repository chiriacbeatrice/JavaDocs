package ro.teamnet.zerotohero.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
class Ceva0{
         public boolean a;
         private int a1;


}



class Ceva extends Ceva0 {

    // initialize to 10
    public int capacity=10 ;
    }

    class Ceva2 extends Ceva {
        public String a = "100";

        public class Altceva0 {
            public int alt0;
            public int alt01;

            public Altceva0(int x){ this.alt0=x;}
            private Altceva0(int x, int y)
            {
                this.alt0=x;
                this.alt01=y;
            }

        }


        public class Altceva1 {
            public int alt1;

        }
    }
public class ClassReflectionDemoMain {
    public int int1;

    public ClassReflectionDemoMain(int x){this.int1=x;}

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }




    public static void main(String[] args) throws Exception {
        //TODO get the class for a String object, and print it
		 Class myClass="myString".getClass();
        System.out.println(myClass);

        //TODO get the class of an Enum, and print it
       Class myClass1=Day.class;
        System.out.println("myClass1="+myClass1);

        //TODO get the class of a collection, and print it
        Collection<String> val=new ArrayList<String>();
        Class myClass2=val.getClass();
        System.out.println("myClass2="+myClass2);

        //TODO get the class of a primitive type, and print it
        int val1=10;
        Class myClass3=Integer.valueOf(val1).getClass();
        System.out.println("myClass3="+myClass3);

        //TODO get and print the class for a field of primitive type
          int val4;
          Ceva obj=new Ceva();
          Class myClass4=null;

          Field fil=Ceva.class.getDeclaredField("capacity");

          val4=(int)fil.get(obj);
          System.out.println(val4);

        //TODO get and print the class for a primitive type, using the wrapper class
          Integer a1=new Integer(100);
          Class myClass5= a1.TYPE;
        System.out.println("myClass5="+myClass5);


        //TODO get the class for a specified class name

        Class myClass6=Class.forName("ro.teamnet.zerotohero.reflection.Ceva2");
        System.out.println("myClass6="+myClass6);

        //TODO get the superclass of a class, and print it
        Class myClass7=Ceva2.class.getSuperclass();
        System.out.println("myClass7="+myClass7);

        //TODO get the superclass of the superclass above, and print it
        Class myClass8=Ceva.class.getSuperclass();
        System.out.println("myClass8="+myClass8);

        //TODO get and print the declared classes within some other class

        Class<?>[] myClass9=Ceva2.class.getDeclaredClasses();
        System.out.println("myClass9=");
        for(Class i:myClass9)
            System.out.println(i);

        //TODO print the number of constructors of a class
        Constructor<?>[] myClass10= Ceva2.Altceva0.class.getDeclaredConstructors();
        int nrconst=0;

        for(Constructor i:myClass10){
            nrconst++;
        }
            System.out.println("Numarul constructorilor este:"+nrconst);

        //TODO get and invoke a public constructor of a class

        Constructor myClass11= ClassReflectionDemoMain.class.getConstructor(int.class);
        Object var1 = myClass11.newInstance(101);
        System.out.println("Constructor: "+myClass11+" "+var1);


        //TODO get and print the class of one private field 


        Class fil1=Ceva0.class.getDeclaredField("a1").getType();
        System.out.println("fil1: "+fil1);


		//TODO set and print the value of one private field for an object

       Ceva0 obj1= new Ceva0();

        Field fil2=obj1.getClass().getDeclaredField("a1");
        fil2.setAccessible(true);
        fil2.set(obj1,20);
        System.out.println("aici "+fil2.get(obj));

        //TODO get and print only the public fields class
        

        //TODO get and invoke one public method of a class
        

        //TODO get and invoke one inherited method of a class
       
		
		//TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
		//TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
		//what do you observe?
		
    }
}
