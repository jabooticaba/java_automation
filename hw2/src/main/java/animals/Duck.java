package animals;

public class Duck extends Herbivore implements Fly, Sweem, Voice {

    public void fly() {
        System.out.println("Уточка летит");
    }

    public void sweem() {
        System.out.println("Уточка плывёт");
    }

    public String voice() {
        return "Уточка говорит: 'Кря-кря!'";
    }
}
