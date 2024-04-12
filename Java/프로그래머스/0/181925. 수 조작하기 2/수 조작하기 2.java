class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        String answer;

        for (int i = 1; i < numLog.length; i++) {
            int diff = Math.abs(numLog[i] - numLog[i - 1]);

            switch(diff) {
                case 1:
                    sb.append(numLog[i] > numLog[i - 1] ? "w" : "s");
                    break;
                case 10:
                    sb.append(numLog[i] > numLog[i - 1] ? "d" : "a");
                    break;
            }
        }

        answer = sb.toString();

        return answer;
    }
}