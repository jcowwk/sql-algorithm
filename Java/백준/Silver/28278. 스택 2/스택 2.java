import java.io.*;
import java.util.Stack;

public class Main {

    static Stack<Integer> stack = new Stack<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N --> 0){
            input(br.readLine());
        }

        br.close();
        bw.flush();
    }

    public static void input(String query) throws IOException {
        char c = query.charAt(0);

        switch (c){
            case '1' : stack.push(Integer.parseInt(query.substring(2))); break;
            case '2' : bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n"); break;
            case '3' : bw.write(stack.size() + "\n"); break;
            case '4' : bw.write((stack.isEmpty() ? 1 : 0) + "\n"); break;
            case '5' : bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n"); break;
            default: break;
        }
    }
}