import java.util.*;

import animals.Animal;
import custom.Size;

public class Paddock <T extends Animal> {

    private Set<T> set = new HashSet<T>();
    private Size paddockSize;

    public void setSize(Size size){
        paddockSize = size;
    }

    public int getSize(){
        return paddockSize.getValue();
    }

    public void addAnimal(T animal) {
        if (animal.getSize() <= paddockSize.getValue()){
            set.add(animal);
        }else{
            System.out.println(animal.getName() + " : животное не помещается в вольер");
        }
    }

    public void removeAnimal(T animal) {
        set.remove(animal);
    }

//    public int getHash(String name) {
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            if (iterator.equals(name)) {
//                return iterator.hashCode();
//            }
//            iterator.next();
//
//        }
//        return 0;
//    }


    public String getSet(){
        return set.toString();
    }  //метод для отладки

}