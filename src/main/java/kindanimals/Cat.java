package kindanimals;

import animals.Pet;

import java.math.BigDecimal;

public class Cat extends Pet {
    public Cat(String breed, String name, float cost, String character) {
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
}
