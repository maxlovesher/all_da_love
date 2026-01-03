import java.util.Scanner;

class Sheet {
    double l, w;

    void read(Scanner sc) {
        l = sc.nextDouble();
        w = sc.nextDouble();
    }

    void cost() {
        System.out.println("Cost: " + (l * w * 40));
    }
}

class Box extends Sheet {
    double h;

    void read(Scanner sc) {
        super.read(sc);
        h = sc.nextDouble();
    }

    void cost() {
        System.out.println("Cost: " + (l * w * h * 60));
    }
}

public class Plastic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            Sheet s = new Sheet();
            s.read(sc);
            s.cost();
        } else if (choice == 2) {
            Box b = new Box();
            b.read(sc);
            b.cost();
        }
    }
}
