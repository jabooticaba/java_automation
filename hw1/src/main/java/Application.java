import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(2, 90, "Barsik", "Miaow");
        Kotik kotik2 = new Kotik();

        kotik1.getClass();
        kotik2.setKotik(3,95, "Princess", "Meow!");

        System.out.println(Kotik.counter);
    }
}
