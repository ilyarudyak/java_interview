package impatient_java;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    // getters
    public final String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name
                + ",salary=" + salary + "]";
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
