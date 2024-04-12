import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int max = -1;
            int start = queries[i][0];
            int end = queries[i][1];
            int number = queries[i][2];

            for (int j = start; j <= end; j++) {
                if (arr[j] > number) {
                    max = (max == -1) ? arr[j] : Math.min(max, arr[j]);
                }
            }

            answer[i] = max;
        }

        return answer;
    }
}