package liang;

/**
 * Created by ilyarudyak on 6/23/16.
 */
public class DynamicBindingDemo {

    public static void print(Object x) {
        System.out.println(x.toString());
    }

    static class GraduateStudent extends Student {
    }

    static class Student extends Person {
        public String toString() {
            return "i'm a student";
        }
    }

    static class Person extends Object {
        public String toString() {
            return "i'm a person";
        }
    }

    public static void main(String[] args) {
        Object o = new GraduateStudent(); // implicit casting

//        Object o1 = new Object();
//
//        if (o1 instanceof GraduateStudent) {
//            System.out.println("Never got here");
//            GraduateStudent gs = (GraduateStudent)o1; // explicit casting
//        }

        print(new GraduateStudent());
        print(new Student());
        print(new Person());
        print(o);
    }


}
