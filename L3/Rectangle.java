// Write a program in Java to create a class Rectangle having data members 	length and breadth 
// and three methods called read, calculate and display to read the values of length and breadth,  
// calculate the area and perimeter of the rectangle and display the result respectively.

import java.util.Scanner;

public class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println(l * b);
    }

    void perimeter() {
        System.out.println(2 * (l + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());
        r.area();
        r.perimeter();
        sc.close();
    }
}
