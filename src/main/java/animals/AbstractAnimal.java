package animals;

import allinterface.Animal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import static java.lang.Math.round;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, float cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = new BigDecimal(cost);
        this.cost = this.cost.setScale(2, RoundingMode.CEILING);
        this.character = character;
        this.birthDate = LocalDate.of(((int) ((round(Math.random() * 2000)))), ((int) (round(Math.random() * 100) % 5) + 1), ((int) (round(Math.random() * 100) % 5) + 1));
    }

    public abstract String getBreed();

    public abstract String getName();

    public abstract BigDecimal getCost();

    public abstract String getCharacter();

    public abstract LocalDate getBirthDate();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        AbstractAnimal animal = (AbstractAnimal) obj;
        if ((getBreed() != animal.getBreed()) || (getCost() != animal.getCost()) || (getCharacter() != animal.getCharacter()) || (getBirthDate() != animal.getBirthDate())){
            return false;
        }
        else {
            return true;
        }

    }

    public String toString() {
        return "Животное{" + "breed='" + breed + "', " + "name='" + name
                + "', " + "cost=" + cost + ", " + "character='" + character + "', " + "bithdate='" + birthDate + "'}";
    }
}
