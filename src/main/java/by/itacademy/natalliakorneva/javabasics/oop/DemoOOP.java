package by.itacademy.natalliakorneva.javabasics.oop;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class DemoOOP {
    public static void main(String[] args) {
        System.out.println("--------------Класс Book--------------");
        System.out.println("Книги в наличии");
        Book book1 = new Book(10927054, "Солнечная система", "Елена Ульева", "CLEVER", 2020, 24, 11.35);
        Book book2 = new Book(101504668, "Канашибари. Обратный отсчёт", "Ангелина Шэн, Вероника Шэн", "O2", 2026, 416, 39.92);
        Book book3 = new Book(101504638, "Сёстры", "Ксения Зарецкая", "Издательство OZ", 2026, 448, 38.60);

        Utils.printBook(book1);
        Utils.printBook(book2);
        Utils.printBook(book3);

        System.out.print("Цена со скидкой книги: ");
        book2.setCount(book2.getCount() - (book2.getCount() * 0.15));
        System.out.println(book2.getTitle() + ", " + "Автора: " + book2.getAuthors() + " - " + book2.getCount() + " руб.");
        System.out.print("В корзине книги: ");
        double sum = book1.getCount() + book3.getCount();
        System.out.println(book1.getTitle() + ", " + book3.getTitle() + ";" + " " + "стоимостью: " + sum);

        System.out.println("--------------Класс Car--------------");
        System.out.println("Доступные машины");
        Car car1 = new Car(143024301, "BMW", "X4 G02", 2019, "черный", 111646, "-");
        Car car2 = new Car(141164785, "Chevrolet", "Malibu IX", 2022, "стильный золотой металлик", 41536, "-");
        Car car3 = new Car(139610441, "Geely", "Haoyue LI", 2023, "черный", 67164, "-");
        Car car4 = new Car(143040827, "Lexus", "GX II", 2010, "серебристый", 53024, "-");
        Car car5 = new Car(14306, "Avatr", "07", 2026, "серый металлик", 119000, "-");

        Utils.printCar(car1);
        Utils.printCar(car2);
        Utils.printCar(car3);
        Utils.printCar(car4);
        Utils.printCar(car5);

        System.out.println("За два дня продали машины: " + car2.getBrand() + " " + car2.getModel() + " стоимостью " + car2.getCount() + " BYN"
                + "\n" + car5.getBrand() + " " + car5.getModel() + " стоимостью " + car5.getCount() + " BYN"
                + "\n" + "Выручка " + (car5.getCount() + car2.getCount()) + " BYN");
        car3.setRegistrationNumber("1212 BH-3");
        System.out.println("Поставили на учет " + car3.getModel() + " с регистрационным номером " + car3.getRegistrationNumber());

        System.out.println("--------------Класс Customer--------------");
        Faker faker = new Faker(new Locale("ru"));
        Customer customer = new Customer();
        customer.setId(faker.number().numberBetween(1, 100));
        customer.setLastName(faker.name().lastName());
        customer.setFirstName(faker.name().firstName());
        customer.setMiddleName(faker.name().firstName() + "ович");
        customer.setAdress(faker.address().fullAddress());
        customer.setCreditCardNumber(faker.finance().creditCard());
        customer.setAccountNumber(faker.finance().iban());

        Customer customer2 = new Customer();
        customer2.setId(faker.number().numberBetween(1, 100));
        customer2.setLastName(faker.name().lastName());
        customer2.setFirstName(faker.name().firstName());
        customer2.setMiddleName(faker.name().firstName() + "ович");
        customer2.setAdress(faker.address().fullAddress());
        customer2.setCreditCardNumber(faker.finance().creditCard());
        customer2.setAccountNumber(faker.finance().iban());
        Utils.printCustomer(customer);
        Utils.printCustomer(customer2);

        customer.setAdress(faker.address().fullAddress());
        customer.setCreditCardNumber(faker.finance().creditCard());
        System.out.println("У клиента: " + customer.getLastName() + " " + customer.getFirstName() + " новый адрес: " + customer.getAdress()
                + " новая карта: " + customer.getCreditCardNumber());

        System.out.println("Клиент " + customer2.getLastName() + " " + customer2.getFirstName() + " приобрел атомобиль "
                + car4.getBrand() + " " + car4.getModel() + " стоимостью " + car4.getCount() + "BYN" + " "
                + " снятые со счета " + customer2.getAccountNumber());
    }
}
