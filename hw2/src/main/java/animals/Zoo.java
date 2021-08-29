package animals;

import food.Grass;
import food.Meat;

public class Zoo {

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        Meat meat = new Meat();
        Grass grass = new Grass();
        fish1.eat(grass);
        fish1.eat(meat);
    }
}
