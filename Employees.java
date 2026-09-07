// Subclass inheriting from Employee
class Manager extends Employees {
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary); // Call the constructor of the parent class
        this.bonus = bonus;
    }

    // Overriding displayDetails to include the bonus and total earnings
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Compensation: ₹" + (salary + bonus));
    }
}

// Main public class matching the filename Employee.java
public class Employees {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        System.out.println("--- Regular Employee ---");
        Employee emp = new Employee("Amit Kumar", 40000.0);
        emp.displayDetails();

        System.out.println("\n--- Manager (with Inheritance) ---");
        Manager mgr = new Manager("Sneha Sharma", 75000.0, 15000.0);
        mgr.displayDetails();
    }
}