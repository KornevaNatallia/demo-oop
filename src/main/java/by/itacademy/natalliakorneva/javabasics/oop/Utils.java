package by.itacademy.natalliakorneva.javabasics.oop;

public class Utils {
    public static void printBook(Book book) {
        System.out.println("ID: " + book.getId() + ", Название: " + book.getTitle() + ", Автор: " + book.getAuthors()
                + ", Издательство: " + book.getPublishingHouse() + ", Год издания: " + book.getYearOfPublication()
                + ", Количество страниц: " + book.getPages() + ", Цена: " + book.getCount() + "руб.");
    }

    public static void printCar(Car car) {
        System.out.println("ID: " + car.getId() + ", Марка: " + car.getBrand() + ", Модель: " + car.getModel()
                + ", Год выпуска: " + car.getYearOfManufacture() + ", Цвет: " + car.getColor() + ", Цена: " + car.getCount() + "руб."
                + ", Регистрационный номер: " + car.getRegistrationNumber());
    }

    public static void printCustomer(Customer customer) {
        System.out.println("ID: " + customer.getId() + ", Фамилия: " + customer.getLastName() + ", Имя: " + customer.getFirstName()
                + ", Отчество: " + customer.getMiddleName() + ", Адрес: " + customer.getAdress()
                + ", Номер кретитной карты: " + customer.getCreditCardNumber() + ", Номер счета: " + customer.getAccountNumber());
    }
}
