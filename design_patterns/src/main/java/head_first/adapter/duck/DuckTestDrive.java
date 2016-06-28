package head_first.adapter.duck;

/**
 * Created by ilyarudyak on 6/27/16.
 */
public class DuckTestDrive {

    public static void main(String[] args) {

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
