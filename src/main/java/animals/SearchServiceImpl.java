package animals;

import allinterface.SearchService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SearchServiceImpl implements SearchService {
    protected ArrayList<AbstractAnimal> listAnimal = new ArrayList<>();
    protected ArrayList<AbstractAnimal> duplicateListAnimal = new ArrayList<>();
    @Override
    public ArrayList<AbstractAnimal> findLeapYearNames(ArrayList<AbstractAnimal> array) {
        if (!array.isEmpty()) {
            for (int i = 0; i < array.size(); i++) {
                boolean isLeapYear = array.get(i).getBirthDate().getYear() % 4 == 0;
                if (isLeapYear) {
                    this.listAnimal.add(array.get(i));
                }
            }
        }
        return this.listAnimal;
    }
    @Override
    public ArrayList<AbstractAnimal> findOlderAnimal(ArrayList<AbstractAnimal> array, int N) {
       if (!array.isEmpty()) {
            for (int i = 0; i < array.size(); i++) {
                boolean isLeapYear = ((LocalDate.now().getYear() - array.get(i).getBirthDate().getYear())) > N;
                if (isLeapYear) {
                    this.listAnimal.add(array.get(i));
                }
            }
        }
        return this.listAnimal;
    }
    @Override
    public ArrayList<AbstractAnimal> findDuplicate(ArrayList<AbstractAnimal> array) {
        if (!array.isEmpty()) {
            Set<AbstractAnimal> set = new HashSet<>();
            array.forEach(n -> {
                if (!set.add(n)) {
                    this.duplicateListAnimal.add(n);
                }
            });
        }
        return this.duplicateListAnimal;
    }
}
