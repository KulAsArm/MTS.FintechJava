import allinterface.CreateAnimalService;
import animals.AbstractAnimal;
import animals.CreateAnimalServiceImpl;
import kindanimals.*;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] arg){
        CreateAnimalServiceImpl animals = new CreateAnimalServiceImpl();
        animals.createAnimalImpl();
        System.out.println("Первый метод отработал!");
        animals.createAnimal(5);
        System.out.println("Второй метод отработал!");
        animals.createAnimal();
        System.out.println("Третий метод отработал!");
    }
}
