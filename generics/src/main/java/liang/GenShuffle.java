package liang;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class GenShuffle {

    public static <E> void shuffle(ArrayList<E> a) {

        Random rand = new Random();
        for (int i = 0; i < a.size(); i++) {
            E tmp = a.get(i);
            int j = rand.nextInt(a.size() - i) + i;
            a.set(i, a.get(j));
            a.set(j, tmp);
        }

    }


    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);

        shuffle(a);
        System.out.println(a);
    }

}
