package liang.comparator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class Developer {

    private String name;
    private BigDecimal salary;
    private Integer age;

    public Developer(String name, BigDecimal salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
