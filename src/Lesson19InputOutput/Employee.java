package Lesson19InputOutput;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1l;



    private String name;
    private Integer id;
    /*private Double salary;*/
    /*transient private Double salary;*/
    private Salary salary = new Salary();


    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary.toString() +
                '}';
    }

    /* public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }*/

 /*   @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }*/
}
