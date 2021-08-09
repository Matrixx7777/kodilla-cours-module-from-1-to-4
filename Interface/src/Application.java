class Application {
    public static void main (String[] args) {

        Pay pay = new Pay();
        pay.draw2();
        ATM_1 atm1 = new ATM_1(new Pay(),new Draw_A_Pay());
        atm1.starting();
        atm1.process();

        System.out.println("Or");

        ATM_1 atm2 = new ATM_1(new Draw_A_Pay(), new Pay());
        atm1.starting();
        atm2.process();
        System.out.println(ATMImpl.draw3());


    }
}

class ATM_1{


    private ATMImpl a1;
    private ATMImpl b1;


    public ATM_1(ATMImpl a1, ATMImpl b1){
        this.a1 = a1;
        this.b1 = b1;
    }

    public void starting(){
        this.b1.start();
    }
    public void process(){
        System.out.println("Please wait - Connecting witch ATM...");
        this.a1.draw();
        System.out.println("The transaction has been completed");
    }


}

interface ATMImpl{

    void start();

    default void draw2(){
        System.out.println("Good morning");
    }

    void draw();

    static String draw3(){
        return "Goodbye";
    }
}

class Pay implements ATMImpl{

    public void draw(){
        System.out.println("You giving the money");
    }

    public void start(){
        System.out.println("Ready to starting Adrian ?");
    }

}

class Draw_A_Pay implements ATMImpl{

    public void start(){
        System.out.println("Starting Adrian");
    }
    public void draw(){
        System.out.println("You getting the money");
    }
}





