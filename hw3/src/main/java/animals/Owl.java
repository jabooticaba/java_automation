package animals;

import custom.Size;

public class Owl extends Carnivorus implements Fly, Voice{

    public Owl(){
        this.animalSize = Size.MEDIUM;
    }

    public void fly() {
        System.out.println("Филин летит");
    }

    public String voice() {
        return "Филин ухает";
    }
}
