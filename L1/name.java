// Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name
import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Full Name: " + lastName + " " + firstName);

        scanner.close();
    }
}
