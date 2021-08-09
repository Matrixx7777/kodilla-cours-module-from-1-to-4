class Application {
    public static void main (String[] args) {

        ClientATM client = new ClientATM();
        client.run();
    }
}

abstract class ATM {

    private void first_method_to_execute(){
        System.out.println("Card insertion request");
    }

    private void second_method_to_execute(){
        System.out.println("Code request");
    }

    private void third_method_to_execute(){
        System.out.println("Request to enter an amount");
    }

    abstract protected void fourth_method_to_execute();

    abstract protected void fifth_method_to_execute();

    abstract protected void sixth_method_to_execute();

    private void seventh_method_to_execute(){
        System.out.println("Withdrawing cash");
    }

    private void eighth_method_to_execute(){
        System.out.println("Thank you for using the Bank's services");
    }

    public void run(){
        this.first_method_to_execute();
        this.second_method_to_execute();
        this.third_method_to_execute();
        this.fourth_method_to_execute();
        this.fifth_method_to_execute();
        this.sixth_method_to_execute();
        this.seventh_method_to_execute();
        this.eighth_method_to_execute();
    }
}

class ClientATM extends ATM {

    protected void fourth_method_to_execute(){
        System.out.println("Information on the acceptance of the withdrawal request by the Bank");
    }

    protected void fifth_method_to_execute(){
        System.out.println("Checking my account balance");
    }

    protected void sixth_method_to_execute(){
        System.out.println("Confirmation of the possibility of withdrawal");
    }

}
