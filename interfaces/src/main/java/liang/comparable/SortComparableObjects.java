package liang.comparable;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class SortComparableObjects {

    public static void main(String[] args) {

        BigInteger[] hugeNumbers = {
                new BigInteger("2323231092923992"),
                new BigInteger("432232323239292"),
                new BigInteger("54623239292")
        };
        System.out.println(Arrays.toString(hugeNumbers));

        Arrays.sort(hugeNumbers);
        System.out.println(Arrays.toString(hugeNumbers));

    }
}



















