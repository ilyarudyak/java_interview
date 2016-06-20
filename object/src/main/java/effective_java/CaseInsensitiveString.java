package effective_java;

/**
 * Created by ilyarudyak on 6/19/16.
 */
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    // Broken - violates symmetry!
//    @Override
//    public boolean equals(Object o) {
//
//        if (o instanceof CaseInsensitiveString) {
//
//            CaseInsensitiveString cisLocal = (CaseInsensitiveString) o;
//            System.out.print("o=" + o + " cisLocal=" + cisLocal + " " + s + " ");
//            System.out.println("s.equalsIgnoreCase(cisLocal.s)=" + s.equalsIgnoreCase( cisLocal.s ));
//
//            return s.equalsIgnoreCase( cisLocal.s );
//        }
//        if (o instanceof String) {// One-way interoperability!
//
//            String oCast = (String) o;
//            System.out.print("o=" + o + " oCast=" + oCast + " s=" + s + " ");
//            System.out.println("s.equalsIgnoreCase(oCast)=" + s.equalsIgnoreCase( oCast ));
//            return s.equalsIgnoreCase( oCast );
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return s;
    }

    // This version is correct - no comparison with String at all
     @Override
     public boolean equals(Object o) {

         if ( !(o instanceof CaseInsensitiveString) ) {
             return false;
         }

     return s.equalsIgnoreCase( ( (CaseInsensitiveString) o ).s );
     }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        CaseInsensitiveString cis2 = new CaseInsensitiveString("pOLISH");
        String str = "polish";

        // true false
        System.out.println(cis.equals(str) + "  " + cis.equals(cis2) + " " + str.equals(cis));
    }
}
