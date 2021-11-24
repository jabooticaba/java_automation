import java.util.*;

import animals.Animal;
import custom.Size;

public class Paddock <T extends Animal> {

    private Size paddockSize;
    private Set<T> set = new HashSet<T>();
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
            System.out.println(animal.getName() + ": животное не помещается в вольер");
        }
    }

    public void removeAnimal(T animal) {
        set.remove(animal);
    }

    public int getHash(String name) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next().hashCode();
            if (i == Objects.hash(name)) {
                return i;
            }
        }
        return 0;
    }
}