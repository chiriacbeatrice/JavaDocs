package ro.teamnet.zerotohero.oop.animals.Exceptions;

import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalManancaOmException;
import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalPeCaleDeDisparitieExption;
import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalZooRar;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class VeterinarZoo implements AngajatZoo {
    public int bonus=0;
    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Veterinarul are grija de animal");
        if (animal instanceof AnimalZooFeroce)
            animal.faceBaie();
        else
            System.out.println("Animalul nu e de tip AnimalZooFeroce");
        calculeazaBonusSalarial();
    }

    @Override
    public void calculeazaBonusSalarial() {
        bonus+=3*valoareBonusPerAnimal;
    }

}


