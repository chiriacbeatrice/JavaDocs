package ro.teamnet.zerotohero.oop.animals.Exceptions;

import ro.teamnet.zerotohero.oop.animals.Exceptions.Exception.AnimalManancaOmException;

/**
 * Created by Beatrice.Chiriac on 7/4/2017.
 */
public class AnimalZooFeroce extends Animal
{
    @Override
    public void mananca(Object obj) throws AnimalManancaOmException  {
            if(obj instanceof AngajatZoo)
                throw new AnimalManancaOmException("AnimalZooException");
            else
                System.out.println("AnimalulZooRar mananca");
    }

    @Override
    public void seJoaca() {
     System.out.println("Animal feroce se joace");
    }

    @Override
    public void faceBaie() {
        System.out.println("Animal feroce face baie");
    }
    @Override
    public void doarme(){
        super.doarme();
        System.out.println("Animalul doarme");

    }
}
