import java.util.*;

public class Al1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Jieva");
        al.add(true);
        al.add("Sandeep");
        al.add(true);
        System.out.println(al.isEmpty());
        // System.out.println(al.Contains());
        System.out.println(al.size());
        System.out.println(al.get(1));
        System.out.println(al);
        System.out.println(al.removeAll(al));
        System.out.println(al);
    }
}
