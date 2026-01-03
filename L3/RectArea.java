// Write a program in java using constructor overloading concept to calculate the area of a rectangle 
// having data member as length and breadth. Use default constructor to initialize the value of the data 
// member to zero and parameterized constructor to initialize the value of data member according to the
// user input. 

import java.util.Scanner;

public class RectArea {
    int l, b;

    RectArea() {
        l = b = 0;
    }

    RectArea(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println(l * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectArea r1 = new RectArea();
        RectArea r2 = new RectArea(sc.nextInt(), sc.nextInt());
        r1.area();
        r2.area();
        sc.close();
    }
}
