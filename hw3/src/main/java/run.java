import animals.*;

public class run {


    public static void main(String[] args) {

        Lion lion1 = new Lion();
        Duck duck = new Duck();
        System.out.println(lion1.getName());

        Paddock paddock = new Paddock<Carnivorus>();

        paddock.addAnimal(lion1);
        paddock.addAnimal(duck);

        System.out.println(paddock.getSet());
    }
}
