public class ExtendsDemo {
  public static void main(String args[]) {

    Calculator1 object = new Calculator1();
    int number1 = 25, number2 = 10;
    object.add(number1, number2);
    object.subtract(number1, number2);
    object.multiply(number1, number2);
    object.divide(number1, number2);
    object.modulus(number1, number2);
  }
}
