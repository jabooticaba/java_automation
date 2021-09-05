package animals;


import custom.Size;

public class Fish extends Carnivorus implements Sweem{

    public Fish(){
        this.animalSize = Size.SMALL;
    }

    public void sweem() {
        System.out.println("Рыба плещется");
    }
}
