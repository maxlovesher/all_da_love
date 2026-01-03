// WAP to take input name, roll no, section & branch and print them

import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        scanner.close();
    }
}