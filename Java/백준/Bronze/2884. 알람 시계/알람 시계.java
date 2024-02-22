import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if (H >= 0 && H < 24) {
            if (M >= 45 && M < 60) {
                M -= 45;
                System.out.printf("%d %d", H, M);
            } else if (M < 45 && M < 60) {
                H--;
                if (H < 0)
                    H = 23;
                M = 60 - 45 + M;
                System.out.printf("%d %d", H, M);
            }   
        } else if (H == 0 && H < 24) {
            if (M >= 45 && M < 60) {
                M -= 45;
                System.out.printf("%d %d", H, M);
            } else if (M < 45 && M < 60) {
                H = 23;
                M = 60 - 45 + M;
                System.out.printf("%d %d", H, M);
            }
        }
    }
}