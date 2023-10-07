import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.print("Enter the number factorial to be known=");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int i;
        int sum = 1;

        if (n == 0) {
            System.out.println(0);
        } else
            for (i = 1; i <= n; i++) {
                sum *= i;

            }
        System.out.println(sum);
    }
}
