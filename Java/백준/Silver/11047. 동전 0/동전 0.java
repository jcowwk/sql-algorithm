import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();

        int [] array = new int[N];

        for(int i=0; i<N; i++) {
            array[i] = sc.nextInt();
        }
        
        int cnt = 0;
        for(int i=N-1; i>=0; i--) {
            if(array[i] <= K) {
                cnt = cnt + K/array[i];
                K = K%array[i];
            }
        }
        System.out.println(cnt);
    }
}