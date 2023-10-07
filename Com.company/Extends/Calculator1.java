public class Calculator1 extends Calculator {
  public void divide(int num1, int num2) {
    result = num1 / num2;

    System.out.println("The division of the given numbers: " + result);
  }

  public void modulus(int num1, int num2) {
    result = num1 % num2;
    System.out.println("The remainder of the given numbers: " + result);
  }
}
