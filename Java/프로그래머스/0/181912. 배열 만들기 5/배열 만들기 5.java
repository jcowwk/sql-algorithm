import java.util.*;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int newInt = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if (newInt > k) {
                answer.add(newInt);
            }
        }
        return answer;
    }
}