class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        
        String answer = "";
        
        int j = 0;
        for (int i = 0; i < c1.length; i++) {
            sb.append(c1[i]);
            sb.append(c2[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}