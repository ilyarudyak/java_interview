package liang.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class ComparatorDeveloper {

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }

    public static void main(String[] args) {

        List<Developer> developers = getDevelopers();
        developers.forEach( (d)->System.out.println(d) );

        // sort by age using List.sort (from java 8)
        developers.sort( (d1, d2) -> d1.getAge() - d2.getAge() );
        System.out.println();
        developers.forEach( (d)->System.out.println(d) );

        // sort by name
        developers.sort( (d1, d2) -> d1.getName().compareTo( d2.getName() ) );
        System.out.println();
        developers.forEach( (d)->System.out.println(d) );

        // sort by salary in reversed order
        Comparator<Developer> salaryComparator = (d1, d2) -> d1.getSalary().compareTo( d2.getSalary() );
        developers.sort( salaryComparator.reversed() );
        System.out.println();
        developers.forEach( (d)->System.out.println(d) );
    }
}
