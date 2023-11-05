package Homework4;

public class Employee {

    private final int id = 2505;
    private final String firstName = "Atanas";

    private final String lastName = "Nikolov";

    private double salaryPerMonth;



    public Employee(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary(double salaryPerMonth) {
        return 12 * salaryPerMonth;
    }

    public double raiseSalary(double salaryPerMonth) {
        double percentage = 15;
        return salaryPerMonth + salaryPerMonth * percentage/100;
    }


    public void printInformation(){
        System.out.println("The employee id is " + id);
        System.out.println("The employee name is " + getName(firstName, lastName));
        System.out.println("The employee salary per month is " + getSalaryPerMonth());
        System.out.println("The employee annual salary is " + getAnnualSalary(salaryPerMonth));
        System.out.println("The employee raised salary is " + raiseSalary(salaryPerMonth));



    }
    
}
