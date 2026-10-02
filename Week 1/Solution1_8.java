package Bai1_8;
public class Solution1_8 {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            // Tránh tràn số cơ bản
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Solution1_8 sol = new Solution1_8();
        int[] testValues = {121, -121, 10, 12321, 1221};
        for (int val : testValues) {
            System.out.println("isPalindrome(" + val + ") = " + sol.isPalindrome(val));
        }
    }
}
