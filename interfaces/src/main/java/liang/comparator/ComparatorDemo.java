package liang.comparator;

import liang.comparable.Circle;
import liang.comparable.GeometricObject;
import liang.comparable.Rectangle;

import java.util.Comparator;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 = new Circle(5);

//        GeometricObject g = max(g1, g2, new Comparator<GeometricObject>() {
//            @Override
//            public int compare(GeometricObject o1, GeometricObject o2) {
//                return (int) (o1.getArea() - o2.getArea());
//            }
//        });

        // the same as previous but with lambda
        GeometricObject g = max( g1, g2, (o1, o2) -> (int) (o1.getArea() - o2.getArea()) );

        System.out.printf("The area of the larger object is %.2f\n", g.getArea());
    }

    public static GeometricObject max(GeometricObject g1, GeometricObject g2,
                                      Comparator<GeometricObject> c) {

        return c.compare(g1, g2) > 0 ? g1 : g2;
    }
}
