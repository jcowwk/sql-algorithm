class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        String s = sb.append(a).append(b).toString();
        int ab1 = Integer.parseInt(s);
        int ab2 = 2 * a * b;
        
        if (ab1 >= ab2) {
            answer = ab1;
        } else {
            answer = ab2;
        }
    
        return answer;
    }
}