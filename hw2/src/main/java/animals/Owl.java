package animals;

public class Owl extends Carnivorus implements Fly, Voice{

    public void fly() {
        System.out.println("Филин летит");
    }

    public String voice() {
        return "Филин ухает";
    }
}
