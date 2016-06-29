package head_first.decorator.starbuzz;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };
    protected Size size; // = Size.TALL;
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return this.size;
    }

    public Beverage() {
        size = Size.TALL;
    }

    protected String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " size: " + getSize() + " price: $" + cost();
    }
}
