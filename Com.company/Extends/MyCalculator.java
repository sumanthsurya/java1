
class Calculator {
  public int result;

  public void add(int num1, int num2) {
    result = num1 + num2;
    System.out.println("The sum of the given numbers: " + result);
  }

  public void subtract(int num1, int num2) {
    result = num1 - num2;
    System.out.println("The difference between the given numbers: " + result);
  }

  public void multiply(int num1, int num2) {
    result = num1 * num2;
    System.out.println("The product of the given numbers: " + result);
  }
}

class Ram extends Calculator {

  public void divide(int num1, int num2) {
    result = num1 / num2;

    System.out.println("The division of the given numbers: " + result);
  }

  public void modulus(int num1, int num2) {
    result = num1 % num2;
    System.out.println("The remainder of the given numbers: " + result);
  }
}

class MyCalculator {
  public static void main(String args[]) {

    Ram object = new Ram();
    int number1 = 25, number2 = 10;
    object.add(number1, number2);
    object.subtract(number1, number2);
    object.multiply(number1, number2);
    object.divide(number1, number2);
    object.modulus(number1, number2);
  }
}
