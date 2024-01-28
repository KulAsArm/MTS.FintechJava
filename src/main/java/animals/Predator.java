package animals;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Predator extends AbstractAnimal{
    public Predator(String breed, String name, float cost, String character){
        super(breed, name, cost, character);
    }
    public abstract String getBreed();
    public abstract String getName();
    public abstract BigDecimal getCost();
    public abstract String getCharacter();
    public abstract LocalDate getBirthDate();
}
