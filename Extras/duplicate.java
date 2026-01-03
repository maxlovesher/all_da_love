// WAP to display duplicate elements in an array 

import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tAKE INPUT
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }

        // sorting the array
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(array[i] == array[j]){
                    System.out.print(array[i] + "");
                }
            }
        }

        scanner.close();
    }
}