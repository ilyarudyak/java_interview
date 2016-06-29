package head_first.decorator.starbuzz.decorators;

import head_first.decorator.starbuzz.Beverage;
import head_first.decorator.starbuzz.CondimentDecorator;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
