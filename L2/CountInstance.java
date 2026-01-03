// Program to find no. of objects created out of a class using ‘static’ modifier.

public class CountInstance {

    static int count = 0;

    CountInstance() {
        count++;
    }

    static void display() {
        System.out.println("Instances: " + count);
    }

    public static void main(String[] args) {
        new CountInstance(); display();
        new CountInstance(); display();
        new CountInstance(); display();
        new CountInstance(); display();
    }
}
