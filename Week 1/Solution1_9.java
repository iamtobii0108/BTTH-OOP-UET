package Bai1_9;
public class Solution1_9 {
    public int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution1_9 solution = new Solution1_9();
        int[] testValues = {12345, -987, 0, 9999};
        for (int val : testValues) {
            System.out.println("sumOfDigits(" + val + ") = " + solution.sumOfDigits(val));
        }
    }
}
