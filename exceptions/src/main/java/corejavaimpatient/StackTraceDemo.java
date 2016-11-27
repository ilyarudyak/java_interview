package corejavaimpatient;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by ilyarudyak on 11/28/16.
 */
public class StackTraceDemo {

    public static void bad() {
        System.out.println(1 / 0);
    }

    public static void main(String[] args) {
        try {
            bad();
        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

//        try {
//            bad();
//        } catch (Exception ex) {
//            StackTraceElement[] frames = ex.getStackTrace();
//            for (StackTraceElement frame : frames)
//                System.out.println("Frame: " + frame);
//        }
    }
}
