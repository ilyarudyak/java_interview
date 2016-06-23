package liang;

/**
 * Created by ilyarudyak on 6/23/16.
 */
public class PassObjectDemo {

    /** Print a table of areas for radius */
    public static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());

            // we change radius of circle here
            c.setRadius(c.getRadius() + 1);

            times--;
        }
    }


    public static void main(String[] args) {
        // Create a Circle object with radius 1
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());

        // Print areas for radius 1, 2, 3, 4, and 5.
        int times = 5;
        System.out.println("times is " + times);
        System.out.println();
        printAreas(myCircle, times);

        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("times is " + times);
    }
}
















