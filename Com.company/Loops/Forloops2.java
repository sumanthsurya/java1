//Print the sum of first n Natural numbers (Where n=4)

import java.util.Scanner;

public class Forloops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
