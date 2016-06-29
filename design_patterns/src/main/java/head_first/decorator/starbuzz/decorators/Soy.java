package head_first.decorator.starbuzz.decorators;

import head_first.decorator.starbuzz.Beverage;
import head_first.decorator.starbuzz.CondimentDecorator;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {

        double cost = beverage.cost();
        Size size = beverage.getSize();

        switch (size) {
            case TALL:
                cost += .10;
                break;
            case GRANDE:
                cost += .15;
                break;
            case VENTI:
                cost += .20;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return cost;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
