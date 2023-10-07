import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        int n, i;
        System.out.println("Enter the no.of terms ");
        Scanner obj1 = new Scanner(System.in);
        n = obj1.nextInt();
        for (i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
