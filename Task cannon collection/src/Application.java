import java.util.LinkedList;
import java.util.List;

class Application {
    public static void main (String[] args) {

        Cannon bullet1 = new Cannon(true);
        bullet1.loaded();

        Cannon bullet2 = new Cannon(false);
        bullet2.loaded();

        Cannon bullet3 = new Cannon(true);
        bullet3.loaded();

        System.out.println("\n" + "One cannon with 20 bullets:");
        Cannon alBulltets1 = new Cannon(true);
        alBulltets1.loadedAllBullets();


        System.out.println("\n"+"All cannons:");
        List<Cannon> cannon = new LinkedList<>();
        cannon.add(bullet1);
        cannon.add(bullet1);
        cannon.add(bullet3);
        cannon.add(bullet2);
        cannon.add(bullet3);
        cannon.add(bullet1);
        cannon.add(bullet2);

        for(Cannon cannons: cannon){
            System.out.println(cannons);
        }



    }
}

class Cannon{

    private boolean bullet;

    public Cannon(boolean bullet){
        this.bullet = bullet;
    }

    public boolean getBullet(){
        return bullet;
    }

    private String fire(){
        return "Shooot !!!";
    }

    public void loaded(){
        if(bullet == true){
            System.out.println("Please wait at 5 second ---- " + fire());
        }
        else{
            System.out.println("No bullet in the cannon. Please load the bullet into the cannon.");
        }
    }

    public void loadedAllBullets(){

        if(bullet == true){
            System.out.println("Please wait at 5 second !");
            for(int i =0; i <20; i ++){
                System.out.println(fire());
            }
        }
    }

    public String toString(){
        if(bullet== true){
            return "Warning ! --- " + fire();
        }
        else{
            return "No bullet";
        }

    }
}