public class V1 {
    // ................static variables(class level)..............
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        int c = 30;
        V1 obj1 = new V1();
        V1 obj2 = new V1();

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        obj2.a = 500;
        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(c);
    }

}
