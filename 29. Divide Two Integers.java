class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
        return -Integer.MIN_VALUE+1;
        }
        int i = 0;
        int sign = 1;
        int sign2 = 1;
        if (dividend < 0) {
            sign = -1;
        }
        if (divisor < 0) {
            sign2 = -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (divisor == 1) {
            return dividend * sign * sign2;
        }
        while (true) {
            dividend -= divisor;
            if (dividend < 0) {
                break;
            }
            i++;
        }
        return i*sign*sign2;
    }
}