// WAP to check whether a given number is a perfect square or not.
import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sqrt = (int)Math.sqrt(number);
        if (sqrt * sqrt == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        scanner.close();
    }
}

