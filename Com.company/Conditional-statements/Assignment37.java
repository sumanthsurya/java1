import java.util.Scanner;

public class Assignment37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String msg = (a >= 100) & (a <= 999) ? "The entered number is 3 digit number"
                : "The given value is not a 3 digit number";
        System.out.println(msg);

    }
}
