package Lesson19InputOutput;

import java.io.Serializable;

public class Salary implements Serializable {
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
