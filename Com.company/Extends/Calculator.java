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
