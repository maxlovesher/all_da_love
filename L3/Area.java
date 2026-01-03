// Write a program which will overload the area () method and display the area of a circle, 
// triangle and square as per user choice and user entered dimensions.

import java.util.Scanner;

public class Area {

    double area(double r) {
        return 3.14 * r * r;
    }

    double area(double b, double h) {
        return 0.5 * b * h;
    }

    int area(int s) {
        return s * s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println(a.area(sc.nextDouble()));
        System.out.println(a.area(sc.nextDouble(), sc.nextDouble()));
        System.out.println(a.area(sc.nextInt()));
        sc.close();
    }
}
