package head_first.adapter.duck;

/**
 * Created by ilyarudyak on 6/27/16.
 */
public class WildTurkey implements Turkey{
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
