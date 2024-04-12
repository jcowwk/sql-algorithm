class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        StringBuilder sb = new StringBuilder();
        
        for (int i : num_list) {
            sb.append(i);
        }
        
        if (num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        
        String s = sb.toString();
        
        for (int i = 0; i < s.length(); i++) {
            answer[i] = Character.getNumericValue(s.charAt(i));
        }
        
        return answer;
    }
}