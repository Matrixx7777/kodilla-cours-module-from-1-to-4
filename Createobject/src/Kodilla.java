import java.lang.*;

class Kodilla {
        public static void main (String[] args) throws java.lang.Exception{

            String name = "Dawid";
            double age = 20.5;
            double height = 180.5;

            MethodAgeAndHeight method = new MethodAgeAndHeight();
            double a1 = method.thisName(age,height,name);




        }
    }

    class MethodAgeAndHeight{
        public double thisName(double age, double height, String name) {

            if(age >= 20 && height >= 180) {
                System.out.println( name + " is older than 20 and higher then 180cm");
            }
            else{
                System.out.println(name + " is younger than 20 and lower then 180cm");
            }
            return age;
        }
    }

