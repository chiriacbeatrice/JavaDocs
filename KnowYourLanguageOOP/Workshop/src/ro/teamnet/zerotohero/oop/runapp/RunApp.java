package ro.teamnet.zerotohero.oop.runapp;

import ro.teamnet.zerotohero.cavas.Canvas;
import ro.teamnet.zerotohero.oop.Exceptions.*;
import ro.teamnet.zerotohero.oop.graphicshape.*;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class RunApp {

    public static void main(String[] args) throws Exception //MyExceptions
    {
        Circles circles=new Circles();
       System.out.println("Cercul are aria"+ circles.getAreaPub());
        circles.getAreaDef();

        Canvas canvas=new Canvas();
        canvas.paint();

        Shape shape=new Circle(10);
        System.out.println(shape.area()+"\n");

        ShapeBehaviour shapeBehaviour=new Square(10);
        System.out.println(shapeBehaviour.area()+"\n");

        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);

        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));

       // Foo f=new Foo();
        //f.bar();

        //Propagation p=new Propagation();
        //p.method3(1,0);

         // NestingException ne=new NestingException();
          //ne.nest(10);
        //ExceptionResorces resorces=new ExceptionResorces();
       // resorces.res("text.txt");

       // Finally f=new Finally();
        //f.fin(2,0);
//        Finally2 f=new Finally2();
//        f.fin2(2,0);

//        MultiCatch mc=new MultiCatch();
//        mc.err(2,0);

        CatchMulExp ce=new CatchMulExp();
        ce.err(1,0);

    }
}
