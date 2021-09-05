package animals;

import custom.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    @Override
    public void eat (Food food) {
        try {
            if (food instanceof Grass) {
                System.out.println("Ест растительную пищу");
            } else {
                throw new WrongFoodException();
            }
        }
        catch (WrongFoodException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
