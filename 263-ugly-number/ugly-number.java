class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        // Divide n by 2, 3, and 5 until it’s no longer divisible
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        // If the result is 1, it means only 2, 3, 5 were factors
        return n == 1;
    }
}
