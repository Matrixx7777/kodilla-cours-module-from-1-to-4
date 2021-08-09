import java.util.*;
import java.lang.*;
import java.io.*;


class Application {
    public static void main (String[] args) {

        Student student1 = new Student("Dawid","Kocik", "10203040506");
        Student student2 = new Student("Marek","Gawroński", "20512058316");
        Student student3 = new Student("Bartek","Golis", "61293790918");
        Student student4 = new Student("Klaudia","Zawadzka", "54305640905");
        Student student5 = new Student("Adrian","Pażucha", "41334041609");
        Student student6 = new Student("Mariusz","Ciepły", "73284212978");
        Student student7 = new Student("Krzysztof","Nieznalski", "34213040345");

        Rating student1Rating = new Rating(5.0,4.0,3.0,3.5,2.5,4.5,5.0,5.0,4.0,3.5);
        Double a1 = student1Rating.average();
        Rating student2Rating = new Rating(4.0,3.5,2.0,2.5,4.5,3.5,4.0,3.5,2.5,3.0);
        Double a2 = student2Rating.average();
        Rating student3Rating = new Rating(2.0,3.0,3.0,2.5,2.5,2.5,3.0,3.0,4.0,4.5);
        Double a3 = student3Rating.average();
        Rating student4Rating = new Rating(4.0,4.5,3.5,4.0,3.5,4.5,4.0,4.0,4.5,2.5);
        Double a4 = student4Rating.average();
        Rating student5Rating = new Rating(3.5,2.0,5.0,4.5,4.5,5.0,3.0,3.0,5.0,4.5);
        Double a5 = student5Rating.average();
        Rating student6Rating = new Rating(4.5,4.0,3.5,3.5,4.5,4.0,3.5,3.0,4.0,3.5);
        Double a6 = student6Rating.average();
        Rating student7Rating = new Rating(5.0,2.5,4.0,2.0,3.5,3.5,5.0,4.5,3.5,3.5);
        Double a7 = student7Rating.average();


        Map<Student, Double> ratingAll1 = new HashMap<>();
        ratingAll1.put(student1, a1);
        ratingAll1.put(student2, a2);
        ratingAll1.put(student3, a3);
        ratingAll1.put(student4, a4);
        ratingAll1.put(student5, a5);
        ratingAll1.put(student6, a6);
        ratingAll1.put(student7, a7);

        for(Map.Entry<Student, Double> equals : ratingAll1.entrySet()){
            System.out.println(equals);
        }
    }
}

class Student{

    private String name;
    private String surname;
    private String pesel;

    public Student(String name, String surname, String pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }


    public String toString(){
        return "Name: " + name + " | Surname: " + surname + " | Pesel: " + pesel + " | Grade average ";
    }
}

class Rating{

    private Double rating1;
    private Double rating2;
    private Double rating3;
    private Double rating4;
    private Double rating5;
    private Double rating6;
    private Double rating7;
    private Double rating8;
    private Double rating9;
    private Double rating10;

    public Rating(Double rating1, Double rating2, Double rating3, Double rating4,
                  Double rating5, Double rating6, Double rating7, Double rating8, Double rating9,
                  Double rating10){
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
        this.rating4 = rating4;
        this.rating5 = rating5;
        this.rating6 = rating6;
        this.rating7 = rating7;
        this.rating8 = rating8;
        this.rating9 = rating9;
        this.rating10 = rating10;
    }


    public Double average(){
        return ((rating1 + rating2 + rating3 + rating4 + rating5 +
                rating6 + rating7 + rating8 +  rating9 + rating10) / 10);
    }

}
