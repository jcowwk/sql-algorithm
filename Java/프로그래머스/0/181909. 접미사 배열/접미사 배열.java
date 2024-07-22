import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] array = new String[length];

        for (int i = 0; i < length; i++) {
            array[i] = my_string.substring(i);
        }

        Arrays.sort(array);

        return array;
    }
}