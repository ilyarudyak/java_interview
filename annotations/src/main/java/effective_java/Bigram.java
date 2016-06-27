package effective_java;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.ObjDoubleConsumer;

/**
 * Created by ilyarudyak on 6/24/16.
 */
public class Bigram {

    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object b) {
        return ((Bigram)b).first == first && ((Bigram)b).second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    @Override
    public String toString() {
        return "Bigram{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));
        System.out.println(s.size());
    }
}
