package cloneable;

public class MainCloneable {

    public static void main(String[] args) {

        Student s1 = new Student("John", 20, "male", "BME");
        try {
            Student johnTheClone = (Student) s1.clone();
            s1.introduce();
            johnTheClone.introduce();

        } catch (CloneNotSupportedException c) {

        }

    }
}
