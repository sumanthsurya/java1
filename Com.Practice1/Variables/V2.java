public class V2 {
    int a = 10;
    static int b = 20;

    // ............instance vaariable (object level variable)..................
    public static void main(String[] args) {
        int c = 30;
        V2 obj1 = new V2();
        V2 obj2 = new V2();

        obj2.b = 340;

        System.out.println(b);
        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(V2.b);
        /*
         * System.out.println(obj1.a);
         * System.out.println(obj2.a);
         * obj2.a = 500;
         * System.out.println(obj1.a);
         * System.out.println(obj2.a);
         */
    }
}
