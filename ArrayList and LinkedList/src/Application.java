import java.util.*;
import java.lang.*;
import java.io.*;


class Application {
    public static void main (String[] args) {

        //   Part one

        System.out.println("List ratings: ");
        List<Double> rating = new ArrayList<>();
        rating.add(5.0);
        rating.add(3.5);
        rating.add(4.5);
        rating.add(3.5);
        rating.add(2.5);
        rating.add(5.0);
        rating.add(3.5);
        rating.add(4.0);
        rating.add(3.75);
        rating.add(5.0);
        rating.add(4.5);
        rating.add(3.75);
        rating.add(4.0);


        for(double i=0.0; i< rating.size(); i++){
            System.out.println("rating: "+ rating.get((int) i));
        }

        System.out.println("");
        System.out.println("List ratings without min and max: ");

        Double min = Collections.min(rating);
        Double max = Collections.max(rating);
        rating.remove(min);
        rating.remove(max);
        rating.remove(max);
        rating.remove(max);

//        for(double ratings: rating){
//            System.out.println("rating: "+ ratings);
//            averageValue+= ratings;
//        }
//        averageValue = averageValue/ rating.size();
//        System.out.println("Average value = " + averageValue);
//        System.out.println(" ");

        double averageValue = 0.0;
        for(double i=0.0; i< rating.size(); i++){
            System.out.println("rating: "+ rating.get((int) i));
            averageValue+= rating.get((int) i);
        }
        averageValue = averageValue/ rating.size();
        System.out.println("Average value = " + averageValue);
        System.out.println(" ");

        //   Part two

        Book book1 = new Book("Richt dad, poor dad", 1997);
        Book book2 = new Book("Romeo i Julia", 1597);
        Book book3 = new Book("Lalka", 1889);
        Book book4 = new Book("Pan Tadeusz", 1834);
        Book book5 = new Book("Chłopi", 1904);
        Book book6 = new Book("Wojna i pokój", 2015);
        Book book7 = new Book("Złe psy. W imię zasad", 2015);
        Book book8 = new Book("Czarna góra", 2021);
        Book book9 = new Book("Lina", 2021);

        List<Book> book = new LinkedList<>();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);
        book.add(book6);
        book.add(book7);
        book.add(book8);
        book.add(book9);

        System.out.println("All books: ");
        for(Book booksAll : book){
            System.out.println(booksAll.dataOfTheBooks());
            // Jeśli dodamy tu toString to nie musimy odwoływać się do pośrednika.
            //Wystarczy wtedy System.out.println(booksAll);
        }
        System.out.println(" ");

        System.out.println("Books older than 2000: ");
        for(Book bookAll : book){
            if(bookAll.getYear() < 2000){
                System.out.println(bookAll.dataOfTheBooks());
            }
        }
    }
}
class Book{
    private String title;
    private int year;

    public Book(String title, int year){
        this.title = title;
        this.year = year;
    }

    public int getYear(){
        return year;
    }
    //Zamiast dataOfTheBooks() | toString() / też możliwe
    public String dataOfTheBooks(){
        return " Title: " + title + "| Date: " + year;
    }

}
