package Homework3;

public class Car {
    private String name = "N/A";
    private String color = "N/A";
    private int releaseYear = -1;

    private int horse = -1;

    private boolean secondHand = false;


    public Car(String name, String color, int releaseYear, int horse, boolean secondHand) {

        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horse = horse;
        this.secondHand = secondHand;

    }
    public Car(String name, String color, boolean secondHand){
        this.name = name;
        this.color = color;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, int releaseYear, int horse) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horse = horse;
    }

    public Car(String name, int releaseYear, int horse, boolean secondHand) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.horse = horse;
        this.secondHand = secondHand;
    }

    public Car() {
    }
}
