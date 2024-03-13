import java.util.Scanner;

class Main {
    static long [] arr = new long[101];
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++) {
            int a = sc.nextInt();
            System.out.println(P(a));
        }
    }
    
    public static long P(int i) {
        if(arr[i] != 0) {
            return arr[i];
        }
        else {
            if(i == 0) {
                return 0;
            }
            if(i == 1 || i == 2 || i == 3) {
                return 1;
            }
            else {
                arr[i] = P(i - 3) + P(i - 2);
                return arr[i];
            }
        }
    }
}