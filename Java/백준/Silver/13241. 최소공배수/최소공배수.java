import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong(), b = sc.nextLong();
        
        long gcd = getGCD(Math.max(a, b), Math.min(a, b));
        
        System.out.println((a * b) / gcd);
    }
    
    public static long getGCD(long a, long b) {
        while(b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}