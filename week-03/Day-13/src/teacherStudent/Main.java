package teacherStudent;

public class Main {

    public static void main(String[] args) {

        Student jim = new Student();
        Teacher ole = new Teacher();

        jim.question(ole);
        ole.teach(jim);

    }
}
