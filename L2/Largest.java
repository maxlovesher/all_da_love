//Find the largest among 3 user entered nos. at the command prompt using Java

public class Largest {

    int largest(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    public static void main(String[] args) {
        Largest obj = new Largest();
        System.out.println(obj.largest(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2])
        ));
    }
}
