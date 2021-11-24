package animals;

public class Elephant extends Herbivore implements Run, Voice{

    public void run() {
        System.out.println("Слоник бежит");
    }

    public String voice() {
        return "Слоник трубит: 'Т-у-у-у-у-т'";
    }
}
