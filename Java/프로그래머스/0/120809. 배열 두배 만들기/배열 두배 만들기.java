class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        int j = 0;
        for (int i : numbers) {
            int n = i * 2;
            
            answer[j++] = n;
        }
        
        return answer;
    }
}