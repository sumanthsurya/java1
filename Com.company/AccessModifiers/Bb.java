package pack2;

public class Bb {
    public static void main(String[] args) {
        Aa d = new Aa();
        d.m1();
        d.m2();
        d.m3();
        // a.m4(); //not possible - m4 is private
    }

}
