package head_first.decorator.starbuzz;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + ": $" + cost();
    }
}
