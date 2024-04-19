class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (char digit : number.toCharArray()) {
            answer += Character.getNumericValue(digit);
        }

        answer = answer % 9;
        return answer;
    }
}