package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice {

    public void fly() {
        System.out.println("Уточка летит");
    }

    public void swim() {
        System.out.println("Уточка плывёт");
    }

    public String voice() {
        return "Уточка говорит: 'Кря-кря!'";
    }
}
