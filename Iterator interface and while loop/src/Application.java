import java.util.*;

class Application {

    public static void main(String[] args) {

        int process = 0;
        int equalsA = 1000;
        int equalsB = 0;
        Random randomGenerator = new Random();

        while(equalsA>equalsB){
        process++;
        System.out.println("Numer przebiegu pętli " + process);

        int firstRandom = randomGenerator.nextInt(9);
        int secondRandom = randomGenerator.nextInt(49);
        System.out.println("Wylosowana liczba pierwsza: " + firstRandom +  ". Wylosowana liczba druga: " + secondRandom);

        equalsA = equalsA + firstRandom;
        equalsB = equalsB + secondRandom;
        System.out.println("Suma A = " + equalsA + "\n" + "Suma B = " + equalsB);
        }

        }
    }