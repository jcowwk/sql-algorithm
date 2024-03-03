import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        array = new int[N + 1];

        System.out.println(fib(N));
    }

    public static int fib(int N) {
        if (N <= 1)
            return N;

        if (array[N] != 0)
            return array[N];

        array[N] = fib(N-1) + fib(N-2);
        return array[N];
    }
}