package animals;

import com.github.javafaker.Faker;
import food.Food;

import java.util.Objects;

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

    /* Аналог переопределения hashCode:

        @Override
        public int hashCode() {
            int result=17;
            result=31*result+(name!=null ? name.hashCode():0);
            return result;
        }
        */

}
