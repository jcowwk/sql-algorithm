import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), M = sc.nextInt();
        int [] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        
        for(int i=0; i<M; i++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            
            while(a < b) {
                int tmp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = tmp;
            }
        }
        
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}