package animals;

import custom.Size;

public class Lion extends Carnivorus implements Run, Voice {

    public Lion() {
        this.animalSize = Size.LARGE;
    }

    public void run() {
        System.out.println("Лёва бежит");
    }

    public String voice() {
        return "Лёва рычит: 'P-p-p-p'";
    }
}
