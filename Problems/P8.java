import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        int n, r;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        while (n > 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }
}
