// Accept 10 numbers from command line and check how many of them are even and how many are odd.

public class EvenOdd {

    void count(int[] a) {
        int even = 0, odd = 0;
        for (int n : a) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Evens: " + even);
        System.out.println("Odds: " + odd);
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++)
            nums[i] = Integer.parseInt(args[i]);

        new EvenOdd().count(nums);
    }
}
