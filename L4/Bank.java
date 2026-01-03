import java.util.Scanner;

class Account {
    int accNo;
    double balance;

    void input(Scanner sc) {
        accNo = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println(accNo + " " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar;

    void input(Scanner sc) {
        super.input(sc);
        name = sc.next();
        aadhar = sc.nextLong();
    }

    void disp() {
        System.out.println(accNo + " " + balance + " " + name + " " + aadhar);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            p[i] = new Person();
            p[i].input(sc);
        }

        for (int i = 0; i < 3; i++)
            p[i].disp();

        sc.close();
    }
}
