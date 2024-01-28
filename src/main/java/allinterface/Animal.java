package allinterface;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Animal {
    LocalDate birthDate = null;
    public String getBreed();
    public String getName();
    public BigDecimal getCost();
    public String getCharacter();
    public LocalDate getBirthDate();

}
