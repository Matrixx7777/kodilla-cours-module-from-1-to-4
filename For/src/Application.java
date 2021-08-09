public class Application {
    public static void main(String[] args) {
        int[] number = new int[20];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 10;
        number[10] = 11;
        number[11] = 12;
        number[12] = 13;
        number[13] = 14;
        number[14] = 15;
        number[15] = 16;
        number[16] = 17;
        number[17] = 18;
        number[18] = 19;
        number[19] = 20;

        double sum = 0;
        for (int i = 0; i < 20; i++) {

            System.out.println("Array element names[" + i + "] = " + "Number " + number[i]);
            sum += number[i];
        }
        sum = sum / number.length;
        System.out.println("Average value: " + sum);
    }
}
