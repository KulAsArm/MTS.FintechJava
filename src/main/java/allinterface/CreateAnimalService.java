package allinterface;

import animals.AbstractAnimal;
import kindanimals.*;

import java.util.ArrayList;
import static java.lang.Math.round;
import java.math.BigDecimal;

public interface CreateAnimalService {
    public default ArrayList<AbstractAnimal> createAnimal() {
        int i = 0;
        ArrayList<AbstractAnimal> listAnimals = new ArrayList<>();
        while (i <= 10) {
            AbstractAnimal animal = randomAnimal(i);
            System.out.println(animal);
            listAnimals.add(animal);
            i++;
        }
        return listAnimals;
    }

    public default AbstractAnimal randomAnimal(int i) {
        switch ((int) (round(Math.random() * 100) % 5)) {
            case 0: {
                return new Dog(String.format("Breed %d", i), String.format("Dog %d", i), i * 110, "Character");
            }
            case 1: {
                return new Cat(String.format("Breed %d", i), String.format("Cat %d", i), i * 80, "Character");
            }
            case 2: {
                return new Wolf(String.format("Breed %d", i), String.format("Wolf %d", i), i * 400, "Character");
            }
            case 3: {
                return new Shark(String.format("Breed %d", i), "Shark", i * 800, "Character");
            }
            case 4: {
                return new Ferret(String.format("Breed %d", i), "Ferret", i * 200, "Character");
            }
            case 5: {
                return new Horse(String.format("Breed %d", i), "Horse", i * 130, "Character");
            }
            case 6: {
                return new Lion(String.format("Breed %d", i), "Lion", i * 300, "Character");
            }
            case 7: {
                return new Monkey(String.format("Breed %d", i), "Monkey", i * 250, "Character");
            }
            case 8: {
                return new Racoon(String.format("Breed %d", i), "Racoon", i * 350, "Character");
            }
            case 9: {
                return new Tiger(String.format("Breed %d", i), "Tiger", i * 800, "Character");
            }
        }
        return null;
    }
}
