package animals;

import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public <T extends Animal & Voice> void getVoice(T animal) {
        System.out.println(animal.voice());
    }

    /* Возможно этот метод подойдет лучше (не такой избыточный):

    public void getVoice (Voice animal){
        System.out.println(animal.voice());
    }
     */

}
