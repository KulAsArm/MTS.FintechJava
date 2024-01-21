package animals;

import allinterface.Animal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;

    public AbstractAnimal(String breed, String name, float cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = new BigDecimal(cost);
        this.cost = this.cost.setScale(2, RoundingMode.CEILING);
        this.character = character;
    }

    public abstract String getBreed();

    public abstract String getName();

    public abstract BigDecimal getCost();

    public abstract String getCharacter();

    public String toString() {
        return "Животное{" + "breed='" + breed + "'," + "name='" + name
                + "'," + "cost=" + cost + "," + "character='" + character + "'}";
    }
}
