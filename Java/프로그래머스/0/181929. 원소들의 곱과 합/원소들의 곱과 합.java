class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        
        for (int i : num_list) {
            if (answer == 0) {
                answer = i;
            } else {
                answer *= i;
            }
        }
        
        for (int i : num_list) {
            sum += i;
        }
        
        sum *= sum;
        
        if (answer < sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}