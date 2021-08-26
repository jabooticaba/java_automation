import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(2, 90, "Barsik", "Miaow");
        Kotik kotik2 = new Kotik();

        kotik2.setKotik(3,95, "Princess", "Meow!");
        kotik1.sleep();
        System.out.println("Количество экземпляров класса Kotik: " + Kotik.getCounter());
        System.out.println("Сытость kotik2: " + kotik2.getFullness());
        kotik2.eat();

    }
}
