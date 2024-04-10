class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int answer = 0;
        
        for (int i : num_list) {
            if (i % 2 == 0) {
                sb1.append(i);
            } else {
                sb2.append(i);
            }
        }
        
        answer += Integer.parseInt(sb1.toString());
        answer += Integer.parseInt(sb2.toString());
        
        return answer;
    }
}