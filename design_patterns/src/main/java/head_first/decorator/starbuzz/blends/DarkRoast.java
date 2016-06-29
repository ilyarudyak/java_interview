package head_first.decorator.starbuzz.blends;

import head_first.decorator.starbuzz.Beverage;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
