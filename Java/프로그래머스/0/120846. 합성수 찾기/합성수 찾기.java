class Solution {
    public int div(int n) {          
        int count=0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (div(i) != 2 && div(i) != 1) {
                answer++;
            }
        }
        
        return answer;
    }
}