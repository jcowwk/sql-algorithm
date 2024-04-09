class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if (flag)
            answer = a + b;
        else if (!flag)
            answer = a - b;
        
        return answer;
    }
}