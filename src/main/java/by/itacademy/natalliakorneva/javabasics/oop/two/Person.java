package by.itacademy.natalliakorneva.javabasics.oop.two;

public class Person extends Student {
    private Integer salary;

    public Person() {
    }

    public Person(String name, Integer grant, Integer salary) {
        super(name, grant);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public int getIncome() {
        int currentSalary = (salary != null) ? salary : 0;
        return super.getIncome() + currentSalary;
    }
}
