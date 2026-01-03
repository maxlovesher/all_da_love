//Write a program to print the week day for the given day no. of the current month using switch case statement
import java.util.Scanner;
public class date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number (1-31): ");
        int day = scanner.nextInt();

        String weekDay;
        switch (day) {
            case 1: case 8: case 15: case 22: case 29:
                weekDay = "Monday";
                break;
            case 2: case 9: case 16: case 23: case 30:
                weekDay = "Tuesday";
                break;
            case 3: case 10: case 17: case 24: case 31:
                weekDay = "Wednesday";
                break;
            case 4: case 11: case 18: case 25:
                weekDay = "Thursday";
                break;
            case 5: case 12: case 19: case 26:
                weekDay = "Friday";
                break;
            case 6: case 13: case 20: case 27:
                weekDay = "Saturday";
                break;
            case 7: case 14: case 21: case 28:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Invalid day number! Please enter a number between 1 and 31.";
        }

        System.out.println("The day is: " + weekDay);
        scanner.close();
    }
}