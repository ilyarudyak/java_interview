package head_first.decorator.starbuzz.blends;

import head_first.decorator.starbuzz.Beverage;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
