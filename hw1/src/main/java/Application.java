import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(2, 90, "Барсик", "Miaow");

        Kotik kotik2 = new Kotik();
        kotik2.setKotik(3,95, "Princess", "Meow!");

        kotik1.liveAnotherDay();
        System.out.println("Имя котика: " + kotik1.getName());
        System.out.println("Вес котика: " + kotik1.getWeight());

        System.out.println("Сравнение голоса: " + kotik1.getMeow().equalsIgnoreCase(kotik2.getMeow()));
        System.out.println("Количество котиков: " + Kotik.getCounter());
    }
}
