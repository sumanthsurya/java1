public class Array6 {
    public static void main(String[] args) {
        int[] marks = { 95, 80, 99, 78, 100, 96 };
        // How to do total of marks
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        System.out.println("The sum of the given marks=" + sum);
    }
}
