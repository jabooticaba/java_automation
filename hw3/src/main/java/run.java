import animals.*;
import custom.Size;

public class run {


    public static void main(String[] args) {

        Lion lion1 = new Lion();
        Lion lion2 = new Lion();

        lion1.setName("go");
        lion2.setName("123");
        System.out.println(lion1.getName());
        System.out.println(lion2.getName());

        Paddock<Carnivorus> paddock = new Paddock<Carnivorus>();
        paddock.setSize(Size.SMALL);
        System.out.println(paddock.getSize());
        System.out.println(lion1.getSize());
        paddock.addAnimal(lion1);
        paddock.addAnimal(lion2);


        System.out.println(paddock.getSet());
    }
}
