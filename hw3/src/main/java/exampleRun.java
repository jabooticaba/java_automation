import animals.*;
import custom.Size;


public class exampleRun {

    public static void main(String[] args) {

        Lion lion1 = new Lion();
        Lion lion2 = new Lion();
        Fish fish = new Fish();

        lion1.setName("Leo");

        Paddock<Carnivorus> paddock = new Paddock<Carnivorus>();
        paddock.setSize(Size.XLARGE);

        paddock.addAnimal(lion1);
        paddock.addAnimal(lion2);
        paddock.addAnimal(fish);

        System.out.println(paddock.getHash("Leo"));

    }
}
