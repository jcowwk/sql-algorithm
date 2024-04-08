class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for(int i = 0; i < s; i ++){
            answer += my_string.charAt(i);
        }
        for(int i = 0; i < overwrite_string.length(); i ++){
            answer += overwrite_string.charAt(i);
        }

        if(answer.length() != my_string.length()){
            for(int i = answer.length(); i < my_string.length(); i ++){
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}