package oreilly.composite;

/**
 * Created by ilyarudyak on 6/26/16.
 */
public class Adder extends BinaryExpression {


    public Adder(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }
}
