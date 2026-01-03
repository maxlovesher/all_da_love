// Write a class file – box with three data members (length, width, height) 	
// and a method volume. Also implement the application class Demo 
// where an object of the box class is created with user entered dimensions 
// and volume is printed.

import java.util.Scanner;

public class Box {
    int l, w, h;

    void read(Scanner sc) {
        l = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
    }

    void volume() {
        System.out.println(l * w * h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        b.read(sc);
        b.volume();
    }
}
