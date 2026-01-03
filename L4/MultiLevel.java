import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate: " + length + " " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box: " + length + " " + width + " " + height);
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox: " + length + " " + width + " " + height + " " + thick);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new WoodBox(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
    }
}
