import java.time.LocalTime;
import java.util.*;
import java.lang.*;


class Application {
    public static void main (String[] args) {

        Order order1 = new Order(1, "Toshiba");
        Order order2 = new Order(2, "Lenovo");
        Order order3 = new Order(2, "Lenovo");
        Order order4 = new Order(1, "Toshiba");
        Order order5 = new Order(2, "Lenovo");
        Order order6 = new Order(2, "Lenovo");

        Set<Order> a1 = new HashSet<>();
        a1.add(order1);
        a1.add(order2);
        a1.add(order3);
        a1.add(order4);
        a1.add(order5);
        a1.add(order6);

        System.out.println(Arrays.toString(a1.toArray()));
    }
}

class Order{

    int index;
    String products;

    public Order(int index, String products){
        this.index = index;
        this.products = products;
    }

    public String getProduct(){
        return products;
    }

    public String toString(){
        return index + " - " + products + " " + hashCode();
    }

    public int hashCode(){
        return index + 100 * 12;
    }

    public boolean equals(Object o){
        Order e = (Order) o;
        return (products.equals(e.getProduct())) ;
    }
}
