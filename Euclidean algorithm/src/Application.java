class Application {
    public static void main(String[] args) {

        // Implementacja algorytmu Euklidesa

        System.out.println(NWD(15,20));
        System.out.println(NWD_2(15,20));

    }

    public static int NWD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        } return a;
    }

    public static int NWD_2(int a, int b) {
        if (b == 0) {
            return a;
        }
        else{
            return NWD_2(b, a % b);
        }
    }
}

