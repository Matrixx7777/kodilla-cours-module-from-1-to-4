import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;


class Application {
    public static void main (String[] args) {


        Books book1 = new Books("Napisz i Spal", "Sharon Jones", 2021, 03, 10);
        Books book2 = new Books("Największy sekret", "Rhonda Byrne", 2021, 04, 14);
        Books book3 = new Books("Jak kochać swoje dziecko i wyznaczać mu granice",
                "Unell Barbara C., Wyckoff Jerry L.", 2021, 04, 14);
        Books book4 = new Books("Zbrodnia i kara", "Fiodor Dostojewski", 2006, 03, 07);
        Books book5 = new Books("Wesele", "Wyspiański Stanisław", 2002, 01, 01);


        Set<Books> setBooks = new HashSet<Books>();
        setBooks.add(book1);
        setBooks.add(book2);
        setBooks.add(book3);
        setBooks.add(book4);
        setBooks.add(book5);

        System.out.println("EMPIK - witamy i zapraszamy");

        System.out.println("Code Book 4 = " + book4.hashCode());
        System.out.println("Code Book 5 = " + book5.hashCode());

        for(Books books : setBooks){
            if(books.getBirthBook().getYear() < 2010){
                System.out.println(books);
            }

        }

    }
}

class Books{
    private String title;
    private String author;
     LocalDate birthBook;


    public Books(String title, String author, int yearOfBook, int monthOfBook, int dayOfBook){
        this.title = title;
        this.author = author;
        this.birthBook = LocalDate.of(yearOfBook, monthOfBook, dayOfBook);
    }

    public int hashCode(){
        return  birthBook.getYear() * 100 + birthBook.getMonthValue();
    }

    public boolean equals(Object o){
        Books e = (Books) o;
        return (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor())) &&
                (birthBook.getYear() == e.getBirthBook().getYear()) &&
                        (birthBook.getMonthValue() == e.getBirthBook().getMonthValue()) &&
                        (birthBook.getDayOfMonth() == e.getBirthBook().getDayOfMonth());
    }

    public String toString(){
        return "Title: " + title + "| Author: " + author + "| Date made of book: " +
                birthBook.getYear() + " " + birthBook.getMonthValue() + " " + birthBook.getDayOfMonth();
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public LocalDate getBirthBook(){
        return birthBook;
    }
}