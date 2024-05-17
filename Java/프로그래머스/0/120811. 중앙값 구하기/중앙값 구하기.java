import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int cnt = 1;
        for (int i : array) {
            if (cnt == (array.length / 2 + 1)) {
                answer = i;
            }
            cnt++;
        }
        
        return answer;
    }
}