package model;


public class Kotik {

    private static int counter;
    private int fullness = 3;
    private int weight;
    private int prettiness;
    private String name;
    private String meow;

    {counter++;}

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

    public boolean isStarving(){
        return fullness <= 0;
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

    public void starve(int x){
        fullness -= x;
    }

    public boolean sleep(){
        if (!isStarving()) {
            System.out.println("Спит");
            starve(1);
            return true;
        }else {
            System.out.print("Котик хочет есть. ");
            return false;
        }
    }

    public boolean purr(){
        if (!isStarving()) {
            System.out.println("Мурчит");
            starve(1);
            return true;
        }else {
            System.out.print("Котик хочет есть. ");
            return false;
        }
    }

    public boolean play(){
        if (!isStarving()) {
            System.out.println("Играет");
            starve(2);
            return true;
        }else {
            System.out.print("Котик хочет есть. ");
            return false;
        }
    }

    public boolean chaseMouse(){
        if (!isStarving()) {
            System.out.println("Преследует мышь");
            starve(3);
            return true;
        }else {
            System.out.print("Котик хочет есть. ");
            return false;
        }
    }

    public boolean lookingOutWindow(){
        if (!isStarving()) {
            System.out.println("Смотрит в окно");
            starve(1);
            return true;
        }else {
            System.out.print("Котик хочет есть. ");
            return false;
        }
    }

    public void liveAnotherDay() {
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
