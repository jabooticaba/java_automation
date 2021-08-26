package model;

public class Kotik {

    int weight;
    int prettiness;
    String name;
    String meow;

    public static int counter;

    public Kotik(){
        counter++;
    }

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
}
