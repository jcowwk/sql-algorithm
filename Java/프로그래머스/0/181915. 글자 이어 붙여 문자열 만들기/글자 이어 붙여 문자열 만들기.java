public class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for (int i : index_list) {
            if (i >= 0 && i < my_string.length()) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}