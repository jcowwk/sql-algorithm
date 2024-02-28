import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), M = sc.nextInt();
        int [] array = new int[N];
 
        for(int i=0; i<N; i++) {
            array[i] = sc.nextInt();
        }
        
        int result = 0;
        for(int i=0; i<N-2; i++) {
            for(int j=i+1; j<N-1; j++) {
                for(int k=j+1; k<N; k++) {
                    int tmp = array[i] + array[j] + array[k];
                    
                    if(M == tmp) {
                        result = tmp;
                    }

                    if(result < tmp && tmp < M) {
                        result = tmp;
                    }
                }
            }
        }

        System.out.println(result);
    }
}