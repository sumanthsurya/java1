public class Progran1 {
    public static void main(String[] args) {
        int i, n;
        String name[] = { "sumanth", "surya", "jievan", "swethamma", "sandeep", "manisha", "jashwanth" };
        System.out.println(name.length);
        System.out.println("1." + name[0]);
        System.out.println("2." + name[1]);
        System.out.println("3." + name[2]);
        System.out.println("4." + name[3]);
        System.out.println("5." + name[4]);
        System.out.println("6." + name[5]);
        System.out.println("7." + name[6]);
        n = name.length;

        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + "." + (name[i]));
        }

    }
}
