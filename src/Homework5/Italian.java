package Homework5;

public class Italian extends Person{

    public Italian(String name, String sex, String religion, String language, String hasJob, String nationality, String egn, String birthDate, String age, String country) {
        super(name, sex, religion, language, hasJob, nationality, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao !");
    }

    public void goodAt(){
        System.out.println("I am making the best pizza in the world !");
    }
}
