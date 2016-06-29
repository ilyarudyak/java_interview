package head_first.decorator.starbuzz.blends;

import head_first.decorator.starbuzz.Beverage;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
