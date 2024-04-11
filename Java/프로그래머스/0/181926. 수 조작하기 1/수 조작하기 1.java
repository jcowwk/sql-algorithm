class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char alpha;
        
        for (int i = 0; i < control.length(); i++) {
            alpha = control.charAt(i);
            
            switch(alpha) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        
        answer += n;
        
        return answer;
    }
}