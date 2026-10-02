package Bai1_7;

public class Solution1_7 {
    public int reverse(int n) {
        long reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
    public static void main(String[] args) {
        Solution1_7 solution = new Solution1_7();
        int[] testValues = {123, -456, 1200, 1534236469, -2147483648};
        for (int val : testValues) {
            System.out.println("reverse(" + val + ") = " + solution.reverse(val));
        }
    }
}