package Bai1_10;
public class Solution1_10 {
    public int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
    public static void main(String[] args) {
        Solution1_10 solution = new Solution1_10();
        int[][] testArrays = {
                {5, 2, 9, 1, 7, 9},
                {10, 10, 10},
                {5},
                {-1, -5, -2}
        };
        for (int[] arr : testArrays) {
            System.out.println("Second largest: " + solution.secondLargest(arr));
        }
    }
}
