package animals;

import allinterface.Animal;
import allinterface.CreateAnimalService;

import java.util.ArrayList;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    public ArrayList<AbstractAnimal> createAnimal(int N){
        ArrayList<AbstractAnimal> listAnimals = new ArrayList<>();
        for(int i = 0; i < N; i++){
            AbstractAnimal animal = randomAnimal(i);
            listAnimals.add(animal);
        }
        return listAnimals;
    }

    public ArrayList<AbstractAnimal> createAnimalImpl(){
        int i = 0;
        ArrayList<AbstractAnimal> listAnimals = new ArrayList<>();
         do {
            AbstractAnimal animal = randomAnimal(i);
            listAnimals.add(animal);
            i++;
        } while (i <= 10);
        return listAnimals;
    }
    public ArrayList<AbstractAnimal> createAnimal(){
        ArrayList<AbstractAnimal> list = CreateAnimalService.super.createAnimal();
        return list;
    }
}
