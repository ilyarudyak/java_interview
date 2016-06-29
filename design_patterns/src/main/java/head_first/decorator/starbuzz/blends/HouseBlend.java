package head_first.decorator.starbuzz.blends;

import head_first.decorator.starbuzz.Beverage;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
