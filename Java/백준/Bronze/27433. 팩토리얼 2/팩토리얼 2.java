import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
       
        System.out.println(factorial(N));
    }
    
    public static long factorial(long N) {
        if(N <= 1) {
            return 1;
        }
        
        return N * factorial(N-1);
    }
}