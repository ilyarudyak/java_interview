package complete_reference;

/**
 * Created by ilyarudyak on 6/13/16.
 */
public class BoundsDemo {

    public static void main(String args[]) {

        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        System.out.print("Averages of iob and dob ");
        if(iob.sameAvg(dob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        // This won't compile because String is not a
        // subclass of Number.
//        String strs[] = { "1", "2", "3", "4", "5" };
//        Stats<String> strob = new Stats<>(strs);

//        double x = strob.average();
//        System.out.println("strob average is " + v);

    }
}

// we can use only subclasses of Number to
// calculate average of an array using
// Numbers.doubleValue();
// if we try to create Stats object with a String
// we'll get compile-time error
class Stats<T extends Number> {
    T[] nums; // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass.
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if(average() == ob.average())
            return true;

        return false;
    }
}
