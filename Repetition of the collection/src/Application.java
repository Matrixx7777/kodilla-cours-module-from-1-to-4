import java.util.*;
import java.lang.*;
import java.io.*;

class Application {
    public static void main (String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");


            String a2 = ", ";
            for (int i = 0; i < 4; i++) {
               String a1 = companies.get(i);
                System.out.print(a1 + a2);
            }
            String a3 = companies.get(4);
            System.out.print(a3);

//            int a4 = companies.size();
//            System.out.println(a4);
    }
}


