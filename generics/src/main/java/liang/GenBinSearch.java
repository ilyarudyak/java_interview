package liang;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class GenBinSearch {

    public static <E extends Comparable<E>> int binarySearch(E[] a, E key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    private static <E extends Comparable<E>> int binarySearch(E[] a, E key, int i, int j) {

        if (i > j) {
            return -1;
        }

        int mid = (i + j) / 2;
        int cmp = key.compareTo(a[mid]);

        if (cmp == 0) {
            return mid;
        } else if (cmp < 0) {
            return binarySearch(a, key, i, mid - 1);
        } else {
            return binarySearch(a, key, mid + 1, j);
        }

    }

    public static void main(String[] args) {

        Integer[] a = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(a, 3));

    }

}
