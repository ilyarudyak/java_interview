package complete_reference;

/**
 * Created by ilyarudyak on 6/23/16.
 */
enum Apple {
    Jonathan, GoldenDelicious, RedDelicious, Winesap, Cortland
}

public class EnumDemo {

    public static void main(String args[]) {

        // (1) assignment
        Apple apple = Apple.RedDelicious;

        // Output an enum value.
        System.out.println("Value of apple: " + apple);

        apple = Apple.GoldenDelicious;

        // (2) compare two enum values.
        if(apple == Apple.GoldenDelicious)
            System.out.println("apple is GoldenDelicious.");

        // (3) use an enum to control a switch statement.
        switch(apple) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDelicious:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDelicious:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}
