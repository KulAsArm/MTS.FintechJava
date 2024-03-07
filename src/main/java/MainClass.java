import allinterface.CreateAnimalService;
import animals.AbstractAnimal;
import animals.CreateAnimalServiceImpl;
import animals.SearchServiceImpl;
import kindanimals.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] arg){
        CreateAnimalServiceImpl animals = new CreateAnimalServiceImpl();
        ArrayList<AbstractAnimal> listAnimal = animals.createAnimalImpl();
        SearchServiceImpl searchService = new SearchServiceImpl();
        System.out.println("Метод поиска животных по високосному году:" + searchService.findLeapYearNames(listAnimal));
        System.out.println("Метод поиска животных по возрасту:" + searchService.findOlderAnimal(listAnimal, 10));
        System.out.println("Метод поиска дубликатов животных:" + searchService.findDuplicate(listAnimal));
    }
}
