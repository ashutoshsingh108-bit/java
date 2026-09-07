import java.util.Scanner;

public class employee {
    private int EmployeeId;
    private String name;
    private double basicSalary;

    public employee(int EmployeeId, String name, double basicSalary) {
        this.EmployeeId = EmployeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double getHra() {
        return basicSalary * 0.20;
    }

    public double getDa() {
        return basicSalary * 0.10;
    }

    public double getGrossSalary() {
        return basicSalary + getHra() + getDa();
    }

    public void displaySalaryDetails() {
        System.out.println("Employee ID: " + EmployeeId);
        System.out.println("Name: " + name);
        System.out.printf("Basic Salary: %.2f%n", basicSalary);
        System.out.printf("HRA (20%%): %.2f%n", getHra());
        System.out.printf("DA (10%%): %.2f%n", getDa());
        System.out.printf("Gross Salary: %.2f%n", getGrossSalary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        employee employee = new employee(employeeId, name, basicSalary);
        System.out.println("\nComplete Salary Details");
        employee.displaySalaryDetails();

        scanner.close();
    }
}