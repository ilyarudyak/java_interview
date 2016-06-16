package liang;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class WildCardNeedDemo {

    /** Find the maximum in a stack of numbers */
    public static double max(GenericStack<Number> stack) {
        double max = stack.pop().doubleValue(); // initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }

        return max;
    }

    /** Find the maximum in a stack of numbers */
    public static double max2(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); // initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }

        return max;
    }

    public static <T> void add(GenericStack<T> stack1,
                               GenericStack<? super T> stack2) {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    public static <E> void add2(GenericStack<? extends E> stack1,
                               GenericStack<E> stack2) {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    public static void main(String[] args ) {
//        GenericStack<Integer> intStack = new GenericStack<>();
//        intStack.push(1);
//        intStack.push(2);
//        intStack.push(-2);

        // error: intStack is not a subclass of GenericStack<Number>
//        System.out.print("The max number is " + max(intStack));

//        System.out.println("The max number is " + max2(intStack));

        GenericStack<Integer> stack1 = new GenericStack<>();
        stack1.push(1);
        stack1.push(2);

        GenericStack<Number> stack2 = new GenericStack<>();
        stack2.push(0.1);

        add2(stack1, stack2);
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

    }
}
