package animals;

import custom.Size;

public class Horse extends Herbivore implements Run, Voice{

    public Horse(){
        this.animalSize = Size.LARGE;
    }

    public void run() {
        System.out.println("Лошадка бежит");
    }

    public String voice() {
        return "Лощадка ржет: 'И-го-го'";
    }
}
