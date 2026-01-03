class Apple {
    void show() {
        System.out.println("Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple a;
        a = new Apple();  a.show();
        a = new Banana(); a.show();
        a = new Cherry(); a.show();
    }
}
