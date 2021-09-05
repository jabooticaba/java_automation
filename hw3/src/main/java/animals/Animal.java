package animals;

import com.github.javafaker.Faker;
import food.Food;

public abstract class Animal {
    Faker faker = new Faker();

    private String name = faker.name().firstName();

    public void eat(Food food){
        System.out.println("Ест");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
