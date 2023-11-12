package Homework5;

public class Main {
    public static void main(String[] args) {

        //Person object
        Person pesho = new Person("Petur", "male", "Orthodox", "Bulgarian", "Plumber", "Bulgarian", "9805105456",  "Bulgaria");
        pesho.celebrateEaster();
        pesho.canTakeLoan();
     //   pesho.setCountry("Brasil");
        pesho.getCountry();

        //Bulgarian object
        Bulgarian bulgarian = new Bulgarian("Petur", "male", "Orthodox",  "Plumber", "9805105456",  "Bulgaria");
        bulgarian.sayHello();
        bulgarian.danceHoro();
        bulgarian.getCountry();
        System.out.println(bulgarian.isAdult());


    }
}
