// Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.
import java.util.Scanner;

public class Matrix {

    void diagonalSum(int[][] m) {
        int l = 0, r = 0;
        for (int i = 0; i < 3; i++) {
            l += m[i][i];
            r += m[i][2 - i];
        }
        System.out.println("Left diagonal sum: " + l);
        System.out.println("Right diagonal sum: " + r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                mat[i][j] = sc.nextInt();

        new Matrix().diagonalSum(mat);
        sc.close();
    }
}
