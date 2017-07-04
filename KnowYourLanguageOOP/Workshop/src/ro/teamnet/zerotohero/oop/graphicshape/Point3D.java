package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Point3D extends Point  {
    private int zPos;

    public Point3D(int x,int y,int zPosVal)
    {
        super(x,y);
        this.zPos=zPosVal;
    }
}
