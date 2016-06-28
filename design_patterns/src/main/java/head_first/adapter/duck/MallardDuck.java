package head_first.adapter.duck;

/**
 * Created by ilyarudyak on 6/27/16.
 */
public class MallardDuck implements Duck {

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
