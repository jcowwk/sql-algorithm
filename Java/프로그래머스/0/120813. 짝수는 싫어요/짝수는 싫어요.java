class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        if (n % 2 == 1) answer = new int[n / 2 + 1];
        else answer = new int[n / 2];

        int cnt = 0;
        for (int i = 1; i <= n; i ++) {
            if (i % 2 == 1) { 
                answer[cnt++] = i; 
            }
        }

        return answer;
    }
}