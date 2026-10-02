package Bai1_6;

public class Solution1_6 {
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution1_6 solution = new Solution1_6();
        int[] testValues = {-5, 0, 1, 2, 17, 100, 2147483647};
        for (int val : testValues) {
            System.out.println("isPrime(" + val + ") = " + solution.isPrime(val));
        }
    }
}
