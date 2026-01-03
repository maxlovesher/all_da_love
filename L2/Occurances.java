//Find the no. of occurrence of each element in a user entered list of nos.
import java.util.Scanner;

public class Occurances {

    void countOccurances(int[] a) {
        boolean[] f = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (!f[i]) {
                int c = 1;
                f[i] = true;
                for (int j = i + 1; j < a.length; j++)
                    if (!f[j] && a[i] == a[j]) {
                        c++;
                        f[j] = true;
                    }
                System.out.println("Occurances of " + a[i] + ": " + c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        new Occurances().countOccurances(arr);
        sc.close();
    }
}
