package by.itacademy.natalliakorneva.javabasics.oop.two;

public class Student extends User {
    private Integer grant;

    public Student() {
    }

    public Student(String name, Integer grant) {
        super(name);
        this.grant = grant;
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }

    public int getIncome() {
        return grant != null ? grant : 0;
    }
}
