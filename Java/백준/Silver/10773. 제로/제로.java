import java.util.*;

class Main {
    public static void main(String [] args) {
        Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
		
        for(int i=0; i<K; i++) {
	        int num = sc.nextInt();
    
	        if(num == 0) {
		        stack.pop();
	        }
	        else {
		        stack.push(num);
	        }
        }
 
        int sum = 0;
        for(int i : stack) {
	        sum += i;
        }
        
        System.out.println(sum);
    }
}