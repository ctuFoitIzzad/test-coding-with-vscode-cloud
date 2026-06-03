import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // --- Interface / Input Section ---
        System.out.print("Enter Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Coding Marks: ");
        double codingMarks = scanner.nextDouble();

        // --- Grading Logic ---
        char grade;
        if (codingMarks >= 80) {
            grade = 'A';
        } 
        // else if (codingMarks >= 70) {
        //     grade = 'B';
        // } else if (codingMarks >= 60) {
        //     grade = 'C';
        // } else if (codingMarks >= 50) {
        //     grade = 'D';
        else {
            grade = 'F';
        }

        // --- Output Section ---
        System.out.println("\nHello " + studentName + " & " + studentID);
        System.out.println("Coding Mark is " + grade);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}