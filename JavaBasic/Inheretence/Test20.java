class Student {
    int s_Id;
    String s_Name;
    int s_Days;
    int a_Days;

    Student(int id, String name, int days) {
        this.s_Id = id;
        this.s_Name = name;
        this.s_Days = days;
        System.out.println("Constructor method");
    }

    void present_Days(int days) {
        this.s_Days = this.s_Days + days;
    }

    void abstent_Days(int days) {
        this.a_Days = this.a_Days + days;
    }

    int get_Total_Present_Days() {
        return this.s_Days;
    }

    int get_Total_Absent_Days() {
        return this.a_Days;
    }

}

class Test20 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sumanth", 1);
        Student s2 = new Student(102, "Surya", 1);

        s1.present_Days(1);
        s1.present_Days(1);
        s2.present_Days(1);
        s2.present_Days(1);
        s2.present_Days(1);
        s2.present_Days(1);
        s2.present_Days(1);
        s2.present_Days(1);
        s1.present_Days(1);
        s2.present_Days(1);
        s1.present_Days(1);
        s1.present_Days(1);
        s1.present_Days(1);
        s1.abstent_Days(1);
        s1.abstent_Days(1);
        s1.abstent_Days(1);
        s1.present_Days(1);
        s1.present_Days(1);
        s1.present_Days(1);
        System.out.println(("The number of present days of" + s1.get_Total_Present_Days()));
        System.out.println(("The number of Absent days of" + s1.get_Total_Absent_Days()));
        System.out.println(("The number of present days of" + s2.get_Total_Present_Days()));
        System.out.println(("The number of Absent days of" + s2.get_Total_Absent_Days()));
    }
}
