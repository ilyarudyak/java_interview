package liang.comparable;

import java.util.Arrays;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class ComparableRectangle extends Rectangle
    implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        return (int) (getArea() - o.getArea());
    }

    public static void main(String[] args) {

        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };
        System.out.println(Arrays.toString(rectangles));

        Arrays.sort(rectangles);
        System.out.println(Arrays.toString(rectangles));
    }
}
