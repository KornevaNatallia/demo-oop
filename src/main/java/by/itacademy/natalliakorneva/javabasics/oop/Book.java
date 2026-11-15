package by.itacademy.natalliakorneva.javabasics.oop;

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publishingHouse;
    private int yearOfPublication;
    private int pages;
    private double count;

    public Book(int id, String title, String author, String publishingHouse, int yearOfPublication, int pages, double count) {
        this.id = id;
        this.title = title;
        this.authors = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.pages = pages;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getPages() {
        return pages;
    }

    public double getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
