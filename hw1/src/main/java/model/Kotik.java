package model;


public class Kotik {

    private static int counter;
    private int fullness = 0;
    private int weight;
    private int prettiness;
    private String name;
    private String meow;

    {counter++;} // Так как конструкторов несколько, выбрал этот способ подсчета объектов класса

    public Kotik() {}

    public Kotik(int weight, int prettiness, String name, String meow){
        this.weight = weight;
        this.prettiness = prettiness;
        this.name = name;
        this.meow = meow;
    }

    public void setKotik(int weight, int prettiness, String name, String meow){
        this.weight = weight;
        this.prettiness = prettiness;
        this.name = name;
        this.meow = meow;
    }

    public int getFullness(){
        return fullness;
    }

    public void eat(int x){
    fullness += x;
    System.out.println("Скушал " + x + " кусочков еды");
    }

    public void eat(int x, String y){
        fullness += x;
        System.out.println("Скушал " + x + " кусочков, продукт: " + y);
    }

    public void eat(){
        eat (5, "мясо");
    }


    public boolean sleep(){
        if (fullness > 0) {
            System.out.println("Спит");
            return true;
        }else {
            System.out.println("Котик хочет есть");
            return false;
        }
    }

    public boolean purr(){
        if (fullness > 0) {
            System.out.println("Мурчит");
            return true;
        }else {
            System.out.println("Котик хочет есть");
            return false;
        }
    }

    public boolean play(){
        if (fullness > 0) {
            System.out.println("Играет");
            return true;
        }else {
            System.out.println("Котик хочет есть");
            return false;
        }
    }

    public boolean chaseMouse(){
        if (fullness > 0) {
            System.out.println("Преследует мышь");
            return true;
        }else {
            System.out.println("Котик хочет есть");
            return false;
        }
    }

    public boolean lookingOutWindow(){
        if (fullness > 0) {
            System.out.println("Смотрит в окно");
            return true;
        }else {
            System.out.println("Котик хочет есть");
            return false;
        }
    }

    public void liveAnotherDay() {  //Не придумал, как сократить конструкцию!
        for (int i = 0; i < 24; ++i) {
            switch ((int) (Math.random() * 5 + 1)) {
                case 1:
                    if (!sleep()) {
                        eat();
                    }
                    break;

                case 2:
                    if (!purr()) {
                        eat();
                    }
                    break;

                case 3:
                    if (!chaseMouse()) {
                        eat();
                    }
                    break;

                case 4:
                    if (!lookingOutWindow()) {
                        eat();
                    }
                    break;

                case 5:
                    if (!play()) {
                        eat();
                    }
                    break;
            }
        }
    }

    public static int getCounter(){
        return counter;
    }

    public int getWeight(){
        return weight;
    }

    public int getPrettiness(){
        return prettiness;
    }

    public String getName(){
        return name;
    }

    public String getMeow(){
        return meow;
    }
}
