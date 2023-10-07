package pack2;

import pack1.A;

public class C extends A {
    public static void main(String[] args) {
        System.out.println("pack3");
        A b = new A();
        b.methodone();
        C c = new C();
        c.methodtwo();

        // System.out.println("We can't access the protected ,default and private");
    }

}
