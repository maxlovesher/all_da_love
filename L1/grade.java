//Write a program to print the corresponding grade for the given mark using if..else statement in Java
// the total marks are out of 100
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks (0-100): ");
        int marks = scanner.nextInt();

        String grade;
        if (marks >= 90 && marks <= 100) {
            grade = "O";
        } else if (marks >= 80 && marks < 90) {
            grade = "E";
        } else if (marks >= 70 && marks < 80) {
            grade = "A";
        } else if (marks >= 60 && marks < 70) {
            grade = "B";
        } else if (marks >= 0 && marks < 60) {
            grade = "C";
        } else {
            grade = "Invalid marks! Please enter a number between 0 and 100.";
        }

        System.out.println("The grade is: " + grade);
        scanner.close();
    }
}