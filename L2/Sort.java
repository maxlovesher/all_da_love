// Program to sort the user entered list of numbers of any size

import java.util.Scanner;

public class Sort {

    void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    a[j] += a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] -= a[j + 1];
                }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Sort obj = new Sort();
        obj.bubbleSort(arr);

        for (int x : arr)
            System.out.println(x);

        sc.close();
    }
}
