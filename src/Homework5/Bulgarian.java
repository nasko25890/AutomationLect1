package Homework5;

public class Bulgarian extends Person{

    public Bulgarian(String name, String sex, String religion, String hasJob, String egn, String country) {
        super(name, sex, religion, "Bulgarian", hasJob, "Bulgarian", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте !");
    }

    public void danceHoro(){
        System.out.println("Айде на хорото !");
    }
}
