package ro.teamnet.zerotohero.oop.animals.Exceptions.Exception;

import ro.teamnet.zerotohero.oop.animals.Exceptions.AngajatZoo;
import ro.teamnet.zerotohero.oop.animals.Exceptions.Animal;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class AnimalZooRar extends Animal{


    public AnimalZooRar(String name, String tara) {
        this.nume=name;
        this.tara_origine=tara;
    }

    public AnimalZooRar(String name) {
        this.nume=name;
    }

    public AnimalZooRar() {}

    @Override
    public void mananca(Object obj) throws AnimalManancaOmException {
        if(obj instanceof AngajatZoo)
            throw new AnimalManancaOmException("AnimalZooException");
        else
            System.out.println("AnimalulZooRar mananca");

    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalulZooRar se joaca");
        super.doarme();

    }

    @Override
    public void faceBaie() {
     System.out.println("AnimalulZooRar face baie");
    }


}
