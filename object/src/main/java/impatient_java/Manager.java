package impatient_java;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    // getters and setters
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() { // Overrides superclass method
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }

    public static void main(String[] args) {

        Manager m = new Manager("John", 1000);
        m.setBonus(100);
        System.out.println(m);

        System.out.println(System.out);
    }
}
