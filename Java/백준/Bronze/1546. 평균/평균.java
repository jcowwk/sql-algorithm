import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double array[] = new double[sc.nextInt()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextDouble();
		}
		sc.close();
		
		double sum = 0;
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			sum += ((array[i] / array[array.length-1]) * 100);
		}
		System.out.print(sum / array.length);
	}
}