package animals;

import com.github.javafaker.Faker;
import custom.WrongFoodException;
import food.Food;

import java.lang.ref.WeakReference;
import java.util.Objects;
import custom.Size;

public abstract class Animal {

    Faker faker = new Faker();

    private String name = faker.name().firstName();
    protected Size animalSize;

    abstract public void eat(Food food) throws WrongFoodException;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return animalSize.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
