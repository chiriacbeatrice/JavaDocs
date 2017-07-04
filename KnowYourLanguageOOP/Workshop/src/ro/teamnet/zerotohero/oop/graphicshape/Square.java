package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Square extends Shape {
    private int side;

    public Square()
    {
        this.side=3;
    }

    public Square(int sideValue)
    {
        this.side=sideValue;
    }


    @Override
    public double area() {

        return side*side;
    }
}
