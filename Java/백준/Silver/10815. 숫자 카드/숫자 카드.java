import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n, m;
        HashMap<String, Integer> hash = new HashMap<>();

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            hash.put(scanner.next(), 0);
        }

        m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            if (hash.get(scanner.next()) != null) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}