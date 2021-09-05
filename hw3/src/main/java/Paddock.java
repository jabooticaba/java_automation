import animals.Animal;

import java.util.HashSet;
import java.util.Set;


public class Paddock <T> {

    private T t;

    private Set<T> set = new HashSet<T>();

    //private Set<T> set;

    //Paddock (T t){
        //this.set = new HashSet<T>();


    public void addAnimal(T animal){
        set.add(animal);}

    public String getSet(){
        return set.toString();
    }

}
