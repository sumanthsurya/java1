import java.util.Scanner;

public class Ifstatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age=" + age);
        if (age > 18) {
            System.out.println("The candidate is eligible for voting");
        } else {
            System.out.println("The candidate is Not eligible for voting");
        }

    }

}
