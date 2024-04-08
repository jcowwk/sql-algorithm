class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        String s1 = sb.append(a).append(b).toString();
        sb.delete(0, sb.length());
        String s2 = sb.append(b).append(a).toString();
        
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        
        if (a >= b) {
            answer = a;
        } else {
            answer = b;
        }
        
        return answer;
    }
}