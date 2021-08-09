import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;


class Application {
    public static void main (String[] args) {
        Book book1 = new Book("Nauka gry w szachy", "Jose Raul Capablanca", 2021);
        Book book2 = new Book("Przyprawy, które leczą", "Maciej Szaciłło , Karolina Szaciłło", 2021);
        Book book3 = new Book("Chomik dżungarski", "Małgorzata Banach", 2021);
        Book book4 = new Book("Jak uwolnić psa od lęku", "Marty Becker , Lisa Radosta , Wailani Sung , Mikkel Becker", 2021);
        Book book5 = new Book("Świetne uczenie się", "dr Jerzy A. Sikora", 2021);

        Order order1 = new Order(book1,2021, 04, 28);
        Order order2 = new Order(book2, 2021, 05, 9);
        Order order3 = new Order(book3, 2021, 05, 12);
        Order order4 = new Order(book4, 2021, 06, 1);
        Order order5 = new Order(book5, 2021, 05, 30);

        ArrayDeque <Order> orders = new ArrayDeque<Order>();
        orders.push(order1);
        orders.push(order2);
        orders.push(order3);
        orders.push(order4);
        orders.push(order5);

        System.out.println(orders.size());
        for(int i = 0; i < orders.size(); i ++){
            System.out.println(orders.peek());
        }


        System.out.println(orders.size());

        Order a1;
        a1 = orders.pop();
        a1 = orders.pop();
        a1 = orders.pop();
        a1 = orders.pop();
        a1 = orders.pop();

        System.out.println("Queue is emptied. It's size: " + orders.size());
        System.out.println();
        System.out.println("Last order taken from queue was:\n" + a1);
    }
}

class Book{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return "Title - " + title + " | author - " + author + " | year - " + year;
    }

}

class Order{
    Book book;
    LocalDate dateOfOrder;

    public Order(Book book, int year, int month, int day){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public Book getBook(){
        return book;
    }

    public LocalDate getDateOfOrder(){
        return dateOfOrder;
    }

    public String toString(){
        return "Order created " + dateOfOrder + "\n" + " book ordered " + book;
    }

}