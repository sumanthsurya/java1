import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.print("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 400 == 0) {
            System.out.println(n + " is a leap year.");

        } else {
            if (n % 100 == 0) {
                System.out.println(n + " is not a leap year.");
            } else if (n % 4 == 0) {
                System.out.println(n + " is a leap year.");
            } else {
                System.out.println(n + " is not a leap year.");
            }
        }
    }
}
