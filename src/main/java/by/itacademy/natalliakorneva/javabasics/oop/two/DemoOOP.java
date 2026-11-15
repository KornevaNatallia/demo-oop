package by.itacademy.natalliakorneva.javabasics.oop.two;

public class DemoOOP {
    static void main() {
        User user1 = new User();
        user1.setName("Ann");
        System.out.println("Пользователь: " + user1.getName());

        Person student = new Person();
        student.setName("Pit");
        student.setGrant(500);
        System.out.println("Студент " + student.getName() + " получает стипендию " + student.getGrant() + "$");

        Person person1 = new Person();
        person1.setName("Bob");
        person1.setSalary(1500);
        person1.setGrant(800);
        System.out.println("Студент " + person1.getName() + " имеет доход " + person1.getIncome() + "$");
    }
}
