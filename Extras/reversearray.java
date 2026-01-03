// WAP to reverse an array in Java

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }

        // Reversing the array
         int[] revarray = new int[size];
        for(int i=0; i<size; i++){
            revarray[i] = array[size-1-i];
            }

        System.out.println("Array in reverse order: ");
                for(int i=0; i<size; i++){
            System.out.print(revarray[i] + " ");
        }
        scanner.close();
    }
}
