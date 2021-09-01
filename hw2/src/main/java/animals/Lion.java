package animals;

public class Lion extends Carnivorus implements Run, Voice {

    public void run() {
        System.out.println("Лёва бежит");
    }

    public String voice() {
        return "Лёва рычит: 'P-p-p-p'";
    }
}
