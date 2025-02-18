abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("------------------------");
    }
}
interface Payable {
    double getPaymentAmount();
}

class FullTimeEmployee extends Employee implements Payable {
    private static final double BENEFIT_PERCENTAGE = 0.2;

    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * BENEFIT_PERCENTAGE);
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

public class Employeemain {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice Johnson", 101, 5000);
        Employee emp2 = new ContractEmployee("Bob Smith", 102, 50, 80);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
    }
}
