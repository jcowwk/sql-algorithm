import java.util.*;
import java.io.*;

class Main {
    static int cnt1 = 0;
    static int cnt2 = 0;
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        fib(N);
        fibonacci(N);
        
        System.out.println(cnt1 + " " + cnt2);
    }
    
    public static int fib(int N) {
        if(N == 1 || N == 2) {
            cnt1++;
            return 1;
        }
        else {
            return (fib(N-1) + fib(N-2));
        }
    }
    
    public static int fibonacci(int N) {
        int [] array = new int[N+1];
        
        array[1] = 1;
        array[2] = 1;
        
        for(int i=3; i<=N; i++) {
            cnt2++;
            array[i] = array[i-1] + array[i-2];
        }
        return array[N];
    }
}