package liang;

import java.util.ArrayList;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class GenStack2<E> extends ArrayList<E> {

    public void push(E o) {
        add(o);
    }

    public E pop() {
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public static void main(String[] args) {

        GenStack2<Integer> stack = new GenStack2<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        System.out.println(stack);
    }
}
