package ro.teamnet.zerotohero.oop.animals.Exceptions;

import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalManancaOmException;
import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalPeCaleDeDisparitieExption;
import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalZooRar;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class IngrijitorZoo implements AngajatZoo {
    public int bonus=0;
    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Ingrijitorul intra in cusca animalului");
    }

    @Override
    public void calculeazaBonusSalarial() {
        bonus+=3*valoareBonusPerAnimal;
    }

    public void lucreaza(Animal animal, Object mancare) throws AnimalPeCaleDeDisparitieExption{
        lucreaza(animal);

        animal.doarme();
        animal.faceBaie();
        animal.seJoaca();
        if((animal instanceof AnimalZooRar)&&(mancare==null))
            throw new AnimalPeCaleDeDisparitieExption("AnimalZooException");
        else
            try {
                animal.mananca(mancare);
                calculeazaBonusSalarial();
            } catch (AnimalManancaOmException e) {
                e.printStackTrace();
            }
    }

}
