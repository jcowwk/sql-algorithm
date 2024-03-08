import java.util.Scanner;
import java.util.Arrays;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
 
		int sum = 0;
        int cnt = 0;
		for(int i=0; i<N; i++) {	
			cnt = arr[i] + cnt;
            sum = sum + cnt;
		}
		System.out.println(sum);
	}
}