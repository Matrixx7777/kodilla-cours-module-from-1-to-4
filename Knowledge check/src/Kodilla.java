public class Kodilla {
    public static void main (String[] args) {

        User kod = new User();
        kod.User("Dawid", "Kocik");
        String name = kod.getName();
        String surname = kod.getSurname();

        System.out.println(name + " " + surname);

    }
}

class User{

    private String name;
    private String surname;

    public void User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

}
