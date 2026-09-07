import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		int total = 0;

		for (int subject = 1; subject <= 5; subject++) {
			System.out.print("Enter marks for subject " + subject + ": ");
			total += scanner.nextInt();
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

		System.out.println("\nStudent Name: " + name);
		System.out.println("Total Marks: " + total);
		System.out.printf("Percentage: %.2f%%%n", percentage);
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + (percentage >= 50 ? "Passed" : "Failed"));

		scanner.close();
	}
}
