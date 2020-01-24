import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            students.add(i, new Student("a", "a", 10));

        }

        for (int i = 0; i < 3; i++) {

            teachers.add(i, new Teacher("a","a", "a"));

        }

        School school = new School("Windermere", 30, 20, teachers, students);

        school.getTeachers();
        school.getStudents();

        System.out.println();

        school.delStudent("a", "a", 10);
        school.delStudent("a", "a", 10);
        school.delTeacher("a", "a", "a");

        school.getTeachers();
        school.getStudents();

    }

}
