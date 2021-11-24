package animals;

public class Horse extends Herbivore implements Run, Voice{

    public void run() {
        System.out.println("Лошадка бежит");
    }

    public String voice() {
        return "Лощадка ржет: 'И-го-го'";
    }
}
