package animals;

import java.math.BigDecimal;

public abstract class Pet extends AbstractAnimal{
    public Pet(String breed, String name, float cost, String character) {
        super(breed, name, cost, character);
    }
    public abstract String getBreed();
    public abstract String getName();
    public abstract BigDecimal getCost();
    public abstract String getCharacter();
}
