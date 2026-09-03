import java.util.Scanner;

public class CaseStudy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        int total = 0;
        for (int subject = 1; subject <= 5; subject++) {
            System.out.print("Enter marks for subject " + subject + " (0-100): ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100.");
                scanner.close();
                return;
            }

            total += marks;
        }

        double percentage = total / 5.0;
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (percentage >= 50 ? "Pass" : "Fail"));

        scanner.close();
    }
}