package leetcode;
/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class Power {
    public double myPow(double x, int n) {
        return binaryExp(x, (long) n);
    }

    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1.0 / binaryExp(x, -n);
        }

        if (n % 2 == 1) {
            return x * binaryExp(x * x, (n - 1) / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
    }

    public static void main(String[] args) {
        Power pw = new Power();
        System.out.println(pw.myPow(2.00000, 10));
    }
}
