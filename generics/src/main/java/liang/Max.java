package liang;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class Max {

    public static Comparable max(Comparable o1, Comparable o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }

    public static void main(String[] args) {

//        System.out.println(Max.max("Welcome", 23));

        GenericStack stack;
        stack = new GenericStack();
        stack.push("Welcome to Java");
        stack.push(new Integer(2));

        System.out.println(stack.pop() + " " + stack.pop());
    }
}
