import java.util.Scanner;

public class Main {
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt(), M = sc.nextInt();
			
			System.out.println(comb(M, N));
		}
	}
	
	static int comb(int M, int N) {
		if(dp[M][N] > 0) return dp[M][N];
		if(N == M || N == 0) return 1;
		
		dp[M][N] = comb(M-1, N-1) + comb(M-1, N);
		return dp[M][N];
	}
}