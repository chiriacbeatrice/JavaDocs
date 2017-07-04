package ro.teamnet.zerotohero.oop.graphicshape;
import java.lang.Math;
/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Circle extends Shape {
    private int xPos;
    private int yPos;
    private int radius;
    static double pi=Math.PI;

    public Circle(){

        this.xPos=1;
        this.yPos=2;
        this.radius=3;

    }
    public Circle(int x){
        this.xPos=x;
        this.yPos=2;
        this.radius=3;
    }
    public Circle(int x, int y){
        this.xPos=x;
        this.yPos=y;
        this.radius=3;
    }
    public Circle(int x, int y, int rad){
        this.xPos=x;
        this.yPos=y;
        this.radius=rad;
    }

    @Override
    public double area() {

        return radius*radius*pi;
    }
    @Override
    public String toString(){
        String string="center="+xPos+","+yPos+"and radius= "+radius;
        return string;

    }
    public void fillColour()
    {
        System.out.println(super.color);
    }
    public void fillColour(int col)
    {
       super.color=col;
        System.out.println("The circle color is now"+ super.color);
    }
    public void fillColour(float col1)
    {
        super.saturation=col1;
    }

}
