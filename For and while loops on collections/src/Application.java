import java.util.*;
import java.lang.*;
import java.io.*;

class Application{
    public static void main (String[] args) {
        // Part 1 and part 2
        ArrayDeque<String> value = new ArrayDeque<>();
        Random theGenerator = new Random();


        for (int i=0; i<50; i++){

            int a1 = theGenerator.nextInt(50)+1;
            String a2 = "";
            for(int j = 0; j<a1; j++)  a2 += "a";
            System.out.println(a2);
            value.offer(a2);
        }

        Tester tester = new Tester();
        tester.printEven(value);
    }
}

class Tester {

    public void printEven(Deque<String> theList) {
        String temporaryValue;

        for (int n = 0; n < theList.size(); n++) {

            temporaryValue = theList.pollFirst();

            if (temporaryValue.length() % 2 == 0) {
                System.out.println("Parzysta " + temporaryValue);

            }

            else{
                System.out.println("Nieparzysta " + temporaryValue);
            }

        }
    }
}
