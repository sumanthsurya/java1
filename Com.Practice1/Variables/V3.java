public class V3 {
    int a = 10;
    static int b = 20;
    // ............local variable (mathod or function level variable)............

    public static void main(String[] args) {
        int c = 30;
        V3 obj1 = new V3();
        V3 obj2 = new V3();

        System.out.println(b);
        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(V3.b);
        System.out.println(c);

        /*
         * System.out.println(obj1.a);
         * System.out.println(obj2.a);
         * obj2.a = 500;
         * System.out.println(obj1.a);
         * System.out.println(obj2.a);
         */
    }
}
