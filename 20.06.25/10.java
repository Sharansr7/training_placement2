public class EvenOddArray {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 8, 1, 4};

        System.out.print("Even: ");
        for (int n : nums) if (n % 2 == 0) System.out.print(n + " ");

        System.out.print("\nOdd: ");
        for (int n : nums) if (n % 2 != 0) System.out.print(n + " ");
    }
}
