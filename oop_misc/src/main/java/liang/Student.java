package liang;

import java.util.Date;

/**
 * Created by ilyarudyak on 6/23/16.
 */
public class Student {

    private int id;
    private String name;
    private Date dateCreated;

    public Student(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(123, "John");
        System.out.println(student);

        // Now dateCreated field is changed!
        // So Student is not immutable!
        Date dateCreated = student.getDateCreated();
        dateCreated.setTime(new Date().getTime() + 5000);
        System.out.println(student);
    }
}


















