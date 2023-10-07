public class If2 {
    public static void main(String[] args) {
        int sal = 15000;

        if (sal > 40000) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
        sal = 40000;

        if (sal > 40000) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
    }
}
