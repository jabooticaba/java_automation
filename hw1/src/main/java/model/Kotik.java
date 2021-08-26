package model;


public class Kotik {

    private static int counter;
    private int fullness = 5;
    private int weight;
    private int prettiness;
    private String name;
    private String meow;

    {counter++;}

    public Kotik() {}

    public Kotik(int weight, int prettiness, String name, String meow){
        this.weight = weight; this.prettiness = prettiness;
        this.name = name; this.meow = meow;
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

    public void eat(){ //TODO Сделать перегрузки метода
    fullness++;
    System.out.println("Кушает");
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
