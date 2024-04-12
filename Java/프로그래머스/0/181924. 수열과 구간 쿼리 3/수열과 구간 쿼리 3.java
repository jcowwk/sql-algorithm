class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }        
        
        return answer;
    }
}