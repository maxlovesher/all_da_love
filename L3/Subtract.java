// Write a program to overload subtract method with various parameters in a class in Java. 
// Write the driver classes to use the different subtract methods using object.

public class Subtract {

    int sub(int a, int b) {
        return a - b;
    }

    int sub(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        Subtract s = new Subtract();
        System.out.println(s.sub(10, 5));
        System.out.println(s.sub(20, 5, 3));
    }
}