package animals;

import custom.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorus extends Animal{

    @Override
    public void eat (Food food){
        try {
            if (food instanceof Meat) {
                System.out.println("Ест мясо");
            } else {
                throw new WrongFoodException();
            }
        }
        catch (WrongFoodException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
