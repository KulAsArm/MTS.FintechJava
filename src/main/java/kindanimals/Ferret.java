package kindanimals;

import animals.Pet;
import animals.Predator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ferret extends Pet {
    public Ferret(String breed, String name, float cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() { return name; }

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
