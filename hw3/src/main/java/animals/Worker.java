package animals;

import custom.WrongFoodException;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        try {
            animal.eat(food);
        }catch (WrongFoodException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void getVoice (Voice animal){
        System.out.println(animal.voice());
    }
}
