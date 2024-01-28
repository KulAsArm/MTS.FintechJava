package allinterface;

import animals.AbstractAnimal;

import java.util.ArrayList;

public interface SearchService {
    ArrayList<AbstractAnimal> findLeapYearNames(ArrayList<AbstractAnimal> array);
    ArrayList<AbstractAnimal> findOlderAnimal(ArrayList<AbstractAnimal> array, int N);
    ArrayList<AbstractAnimal> findDuplicate(ArrayList<AbstractAnimal> array);
}
