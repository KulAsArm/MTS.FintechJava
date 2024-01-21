package kindanimals;

import animals.Predator;

import java.math.BigDecimal;

public class Racoon extends Predator {
    public Racoon(String breed, String name, float cost, String character) {
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
