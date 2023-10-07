import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int fact = 0;
            for (int j = 1; j <= n; i++) {
                if (i % j == 0) {
                    fact++;
                }
            }
            if (fact == 2) {
                System.out.println(i);
            }
        }
    }
}
