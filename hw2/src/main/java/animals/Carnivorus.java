package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorus extends Animal{
    @Override
    public void eat (Food food){  //TODO Попробовать вставить в sout {зверь} ест {еду}
        if (food instanceof Meat){
            System.out.println("Ест мясо");
        }else {
            System.out.println("Хищник не ест траву!");
        }


    }
}
