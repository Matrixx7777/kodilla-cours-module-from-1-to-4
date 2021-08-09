public class start {
    public static void main(String[] args){
        User user = new User();
        user.User("Dawid","Kocik", 20);
        String name = user.getName();
        String surname = user.getSurname();
        int age = user.getAge();
        System.out.println(name + " " + surname + " " + age + " lat");


    }
}
