// WAP to find the largest element in an array
import java.util.Scanner;
public class largest1array {
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
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        System.out.print("The largest element is " + array[size-1]);
        scanner.close();
    }
}
