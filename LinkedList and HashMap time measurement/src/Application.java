import java.util.*;
import java.lang.*;
import java.io.*;

class Application {
    public static void main(String[] args) {

        // Part 1
        Books book1 = new Books( "Kodilla", "Adrian ;P");
        Books book2 = new Books("Modilla", "Arek");
        Books book3 = new Books("Odilla", "Miłosz");
        Books book4 = new Books("Rodilla", "Marek");

        LinkedList<Books> list = new LinkedList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);

//        int process = 0;

        for (int i = 0; i < 30000; i++) {

         //   System.out.println(" Powtórka książek numer " + process++ + " - " + list);
            LinkedList<Books> a1 = list;
//            System.out.println(a1);
        }

//        for (int i = 0; i < 5; i++){
//
//            System.out.println("Book number == " + process++ + " " + book1 + "\n" +
//                    "Book number == " + process++ + " " + book2 + "\n" +
//                    "Book number == " + process++ + " " + book3 + "\n" +
//                    "Book number == " + process++ + " " + book4 + "\n");
//        }

        long begin1 = System.nanoTime();
        list.remove(list.size() - 1);
        long end1 = System.nanoTime();


        System.out.println("Removed last element in list " + (end1 - begin1) + " nano time");


        begin1 = System.nanoTime();
        list.remove(0);
        end1 = System.nanoTime();


        System.out.println("Removed first element in list " + (end1 - begin1) + " nano time");
        System.out.println();

        // Part 2

        Map<Integer, LinkedList> map = new HashMap<>();
        map.put(1, list);
        map.put(2, list);
        map.put(3, list);
        map.put(4, list);

        System.out.println(map.size());


        for (int j = 0; j < 45000; j++) {

           map.keySet();
        }




        long begin = System.nanoTime();
        map.remove(map.size() - 1);
        long end = System.nanoTime();


        System.out.println("Removed last element in map " + (end - begin) + " nano time");


        begin = System.nanoTime();
        map.remove(0);
        end = System.nanoTime();

        // Displaying time of deletion
        System.out.println("Removed first element in map " + (end - begin) + " nano time");

    }
}

class Books {

    private String title;
    private String author;


    public Books(String title, String author){
        this.title = title;
        this.author = author;


    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }


    @Override
    public String toString(){
        return "Title book: " + title + " | Author: "  + author;
    }


    @Override
    public boolean equals (Object o) {
        Books e = (Books) o;
        return title.equals(e.getTitle()) &&
                author.equals(e.getAuthor()) ;

    }
}

