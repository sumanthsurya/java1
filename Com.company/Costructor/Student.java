public class Student {
    int std_id;
    String std_name;
    int std_attendance;

    // constructor method
    Student(int id, String name, int attendance) {
        this.std_id = id;
        this.std_name = name;
        this.std_attendance = attendance;

    }

    void std_absents(int attendance) {

    }

    int get_Totalpresents(int attendance) {
        return (this.std_attendance);
    }

    void std_presents(int attendance) {

    }
}
