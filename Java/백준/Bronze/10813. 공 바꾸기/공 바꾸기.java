import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        
        int [] array = new int[N+1];
       
        int a;
        for(a=1; a<=N; a++) {
            array[a] = a;
        }
        
        for(a=0; a<M; a++) {
            int i = sc.nextInt(), j = sc.nextInt();
            int tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }

        for(a=1; a<=N; a++) {
            System.out.print(array[a] + " ");        
        }
    }
}