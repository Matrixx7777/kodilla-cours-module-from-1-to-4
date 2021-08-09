class Application {
    public static void main (String[] args) {

        NumberOfProductSalary a1 = new NumberOfProductSalary(50,75);
        FixedSalaryPlusBonus a2 = new FixedSalaryPlusBonus(2500,true);

        SalaryPayout sp = new SalaryPayout(a1);
        sp.process();
        System.out.println();
        SalaryPayout sp1 = new SalaryPayout(a2);
        sp1.process();

    }
}


interface Employee{

    double calculateSalary();


}

class NumberOfProductSalary implements Employee {

    private double salary;
    private double amountOfProduct;

    public NumberOfProductSalary(double salary, double amountOfProduct){
        this.salary = salary;
        this.amountOfProduct = amountOfProduct;
    }

    public double calculateSalary(){

        return this.salary * this.amountOfProduct;
    }



}

class FixedSalaryPlusBonus implements Employee{

    private double fixedSalary;
    private boolean plusBonus;

    public FixedSalaryPlusBonus(double fixedSalary, boolean plusBonus){
        this.fixedSalary = fixedSalary;
        this.plusBonus = plusBonus;

    }

    public double calculateSalary() {

        if(plusBonus == true){
            return this.fixedSalary * 1.2;
        }
        else{
            return this.fixedSalary;
        }
    }


}

 class SalaryPayout{

    private Employee employee;

    public SalaryPayout(Employee employee){
        this.employee = employee;
    }

    public void process(){
        System.out.println("Creating payout for: "  +  this.employee.calculateSalary() + " PLN");
        System.out.println("Payout has been completed!");
    }

}


