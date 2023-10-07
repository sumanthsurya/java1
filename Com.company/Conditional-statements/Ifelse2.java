import java.util.Scanner;

public class Ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of variable a=");
        int a = sc.nextInt();
        System.out.println("Enter the value of variable b=");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("variable a is equal to variable b");
        } else {
            if (a > b) {
                System.out.println("variable a is Greater than variable b");
            } else {
                System.out.println("variable a is Lesser than variable b");
            }
        }

    }

}
