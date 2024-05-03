class Solution {
    public int solution(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        
        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567;
        }
        
        return fib[n];
    }
}