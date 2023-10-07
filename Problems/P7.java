import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        int n, i, sum = 0, sum2 = 0;
        System.out.print("Enter the no.of terms ");
        Scanner obj1 = new Scanner(System.in);
        n = obj1.nextInt();
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else if (i % 2 != 0) {
                sum2 = sum2 + i;
            }
        }
        System.out.println("sum of n even numbers=" + sum);
        System.out.println("sum of n odd numbers=" + sum2);
    }
}
