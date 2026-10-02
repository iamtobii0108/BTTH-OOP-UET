public class Solution1_5 {
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Solution1_5 solution = new Solution1_5();
        System.out.println("KET QUA TEST");
        System.out.println(solution.gcd(24,36));
        System.out.println(solution.gcd(15, 0));
        System.out.println(solution.gcd(0, 7));
        System.out.println(solution.gcd(-24, 36));
        System.out.println(solution.gcd(-12, -18));
        System.out.println(solution.gcd(17, 13));
    }
}