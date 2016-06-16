package misc;

import java.util.Arrays;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class GenArray {

    public static void main(String[] args) {

//        Number[] numbers = new Number[3];
//        numbers[0] = new Integer(10);
//        numbers[1] = new Double(3.14);
//        numbers[2] = new Byte("0");
//
//        System.out.println(Arrays.toString(numbers));

        Integer[] myInts = {1,2,3,4};
        Number[] myNumber = myInts;
        myNumber[0] = 3.14; //attempt of heap pollution

    }
}






























