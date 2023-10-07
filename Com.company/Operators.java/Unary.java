import java.util.Scanner;

public class Unary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("The operations are below Displayed:-");
        System.out.println("1.The addition of 2 numbers (a+b)=" + (a + b));// unary plus
        System.out.println("2.The subtraction of 2 numbers(a-b)=" + (a - b));// unary minus
        System.out.println("3.The post increment of the numbers(a = b++)= " + (a = b++));// post increment
        System.out.println("The value of b=" + b);
        System.out.println("4.The post decrement of the numbers(a =b--)=" + (a = b--));// post decrement
        System.out.println("5.The pre increment of the numbers(a = ++b)=" + (a = ++b));// pre increment
        System.out.println("6.The pre decrement of the numbers(a= --b)=" + (a = --b));// pre decrement
        System.out.println("7.check whether the condition is true or false (logical not)(a!=b)=" + (a != b));// logical
                                                                                                             // not

    }

}
