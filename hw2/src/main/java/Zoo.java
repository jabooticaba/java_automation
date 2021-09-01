import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Lion lion = new Lion();
        Owl owl = new Owl();
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Horse horse = new Horse();
        Elephant elephant = new Elephant();

        worker.feed(lion, new Vegetables());
        worker.getVoice(lion);
        worker.feed(elephant, new Pork());
        worker.getVoice(elephant);
        worker.feed(owl, new Mutton());
        worker.feed(duck1, new Grain());
        worker.getVoice(duck1);
        worker.feed(horse, new Fruits());

        Sweem[] pond = new Sweem[4];
        pond[0] = duck1;
        pond[2] = duck2;
        pond[1] = fish1;
        pond[3] = fish2;

        for (int i = 0; i < pond.length; i++){
            pond[i].sweem();
        }
    }
}
