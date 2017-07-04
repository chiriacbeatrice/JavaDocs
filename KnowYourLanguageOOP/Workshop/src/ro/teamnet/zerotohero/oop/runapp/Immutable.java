package ro.teamnet.zerotohero.oop.runapp;

import java.util.Date;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class Immutable {
    private final double fMass;
    private final String fName;
    private final Date fDateOfDiscovery;

    public Immutable (double aMass, String aName, Date aDateOfDiscovery) {
        fMass = aMass;
        fName = aName;
        //make a private copy of aDateOfDiscovery
        //this is the only way to keep the fDateOfDiscovery
        //field private, and shields this class from any changes that
        //the caller may make to the original aDateOfDiscovery object
        fDateOfDiscovery = new Date(aDateOfDiscovery.getTime());
    }

    public double getMass() {
        return fMass;
    }

    public String getName() {
        return fName;
    }


    public Date getDateOfDiscovery() {
        return new Date(fDateOfDiscovery.getTime());
    }




}
