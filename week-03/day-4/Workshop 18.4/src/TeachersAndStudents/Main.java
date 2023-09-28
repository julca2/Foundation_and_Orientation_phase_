package TeachersAndStudents;

public class Main {
    public static void main(String[] args) {
        Student Monika = new Student();
        Teacher Stefi = new Teacher();

        Stefi.teach(Monika);
        Monika.question(Stefi);
    }
}
//