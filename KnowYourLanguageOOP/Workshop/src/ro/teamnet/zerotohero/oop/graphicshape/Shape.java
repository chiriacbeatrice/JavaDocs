package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Shape extends AbstractShape  implements ShapeBehaviour{
    protected int color;
    protected float saturation;

    public double area(){
        return 0;
    }

    public void setColor(int newcolor) {
        this.color = newcolor;
    }

    public void setSaturation(float newsaturation){
        this.saturation=newsaturation;
    }


    }
