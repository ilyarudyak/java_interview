package effective_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix,
                       int lineNumber) {
        rangeCheck(areaCode,    999, "area code");
        rangeCheck(prefix,      999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode  = (short) areaCode;
        this.prefix  = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    // helper method
    private static void rangeCheck(int arg, int max,
                                   String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name +": " + arg);
    }
    @Override
    public boolean equals(Object o) { if (o == this)
        return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber
                && pn.prefix  == prefix
                && pn.areaCode  == areaCode;
    }

    @Override
    // this is from Horstmann, Bloch suggests using something
    // low-level (based on hash code for String class)
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNumber);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }


    public static void main(String[] args) {

        Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();

        // here we use *equal* but not the *same* object and get null
        // if
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        System.out.println( m.get(new PhoneNumber(707, 867, 5309)) );

        // here we use the *same* object and it works
        // even if hashCode() is not implemented
        PhoneNumber pn = new PhoneNumber(707, 867, 5309);
        m.put(pn, "Jenny");
        System.out.println( m.get(pn) );
    }
}

















