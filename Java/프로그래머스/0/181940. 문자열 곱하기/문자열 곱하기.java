class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        while (k > 0) {
            sb.append(my_string);
            k--;
        }
        
        answer = sb.toString();
        return answer;
    }
}