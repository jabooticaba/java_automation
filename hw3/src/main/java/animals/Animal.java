package animals;

import com.github.javafaker.Faker;
import food.Food;
import java.util.Objects;
import custom.Size;

public abstract class Animal {

    Faker faker = new Faker();

    private String name = faker.name().firstName();
    protected Size animalSize;

    public void eat(Food food){
        System.out.println("Ест");
    }

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
