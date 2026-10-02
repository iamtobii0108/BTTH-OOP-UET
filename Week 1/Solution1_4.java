package Bai1_4;
public class Solution1_4 {
    public static long fibonacci(long n) {
        if(n<0) {
            return -1;
        }
        if(n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        long a=0;
        long b=1;
        long kq=0;
        for(long i=2;i<=n;i++){
            if(Long.MAX_VALUE - a < b){
                return Long.MAX_VALUE;
            }
            kq=a+b;
            a=b;
            b=kq;
        }
        return kq;
    }
    public static void main(String[] args) {
        Solution1_4 solution = new Solution1_4();
        long[] testValues = {-1, 0, 1, 2, 5, 10, 50, 92, 93, 100};
        System.out.println("KET QUA TEST");
        for (long n : testValues) {
            long res = solution.fibonacci(n);
            if (res == Long.MAX_VALUE) {
                System.out.println("fibonacci(" + n + ") = Vượt quá giới hạn kiểu long (Long.MAX_VALUE)");
            } else {
                System.out.println("fibonacci(" + n + ") = " + res);
            }
        }
    }
}
