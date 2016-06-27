package oreilly.composite;

/**
 * Created by ilyarudyak on 6/26/16.
 */
public class Constant implements Expression {

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
