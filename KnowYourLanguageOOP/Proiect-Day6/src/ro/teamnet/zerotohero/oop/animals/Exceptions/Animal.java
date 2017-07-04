package ro.teamnet.zerotohero.oop.animals.Exceptions;

import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalManancaOmException;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public abstract class Animal {

    public String nume;
    public String tara_origine;

    public abstract void mananca(Object obj) throws AnimalManancaOmException;
    public abstract void seJoaca();
    public abstract void faceBaie();
    public void doarme(){
        System.out.println("Animalul doarme.");
    }

    public Animal()
    {
        System.out.println("Animal nou.");
    }

}
